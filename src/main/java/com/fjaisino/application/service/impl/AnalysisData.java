package com.fjaisino.application.service.impl;

import com.fjaisino.application.common.model.outmessage.outparam.ResultData;
import com.fjaisino.application.common.model.outmessage.outparam.ZzsfppxtParam;
import com.fjaisino.application.common.model.outmessage.outzzsfpxt.request.OuterInputInput;
import com.fjaisino.application.common.model.outmessage.outzzsfpxt.request.OuterInputZzsfpxt;
import com.fjaisino.application.common.model.outmessage.outzzsfpxt.response.OuterOutputInput;
import com.fjaisino.application.common.model.outmessage.outzzsfpxt.response.OuterOutputZzsfpxt;
import com.fjaisino.application.common.model.outmessage.rootmsg.RootMsg;
import com.fjaisino.application.common.model.outmessage.technologymsg.request.Identity;
import com.fjaisino.application.common.model.outmessage.technologymsg.request.TripTechnologyPackage;
import com.fjaisino.application.common.model.outmessage.tripmsg.request.SignaturePackege;
import com.fjaisino.application.common.model.outmessage.tripmsg.request.TripPackage;
import com.fjaisino.application.common.model.outmessage.tripmsg.response.OutputTripPackage;
import com.fjaisino.application.common.util.Base64Encoder;
import com.fjaisino.application.common.util.GZIPUtils;
import com.fjaisino.application.common.util.Md5;
import com.fjaisino.application.common.util.XmlUtil;
import com.fjaisino.application.service.FjwsslService;
import org.apache.log4j.Logger;
import org.springframework.util.StringUtils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: application
 * @description:
 * @author: Mr.Peng
 * @create: 2018-12-14 16:00
 **/

public class AnalysisData {

    private static Logger logger = Logger.getLogger(AnalysisData.class);
    //组装技术报文
    public static String assemblyTechnologyMessage(String nsrsbh, String sktype){
        if(StringUtils.isEmpty(nsrsbh)||StringUtils.isEmpty(sktype)){
            logger.error("缺少纳税人识别号或sktype");
            return "false";
        }
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd HHmmss");
        String time = sdf.format(date);
        Identity identity = new Identity();
        if("JSP".equals(sktype)){
            identity.setApplicationId("zzs_fp_cgl_cj");
            identity.setServiceId("dzdz_gpxx_shenqing_zzszp");
            identity.setNsrsbh(nsrsbh);
            identity.setSenderName("sg");
            identity.setSendTime(time);
            identity.setGlobalBusinessId("9150010220181128A_682234430");
            identity.setCommand("GENERAL_COMMUNITY");

        }else if("SKP".equals(sktype)){
            identity.setApplicationId("zzs_fp_cgl_cj");
            identity.setServiceId("dzdz_gpxx_shenqing_hyfp");
            identity.setNsrsbh(nsrsbh);
            identity.setSenderName("sg");
            identity.setSendTime(time);
            identity.setGlobalBusinessId("9150010220181128A_682342663");
            identity.setCommand("GENERAL_COMMUNITY");
        }else{
            logger.error("输入信息有误！");
            return "false";
        }

        TripTechnologyPackage tripTechnologyPackage = new TripTechnologyPackage();
        tripTechnologyPackage.setIdentity(identity);
        String technologyXml =  XmlUtil.convertToXml(tripTechnologyPackage,"UTF-8");
        return technologyXml;

    }

    //通信报文组装
    public static String assemblyTripMessage(String tecXml,String busXml) throws Exception {
        String tecXml1 = new String(Base64Encoder.encode(tecXml.getBytes("UTF-8")));
        String busXml1 = new String(Base64Encoder.encode(busXml.getBytes("GBK")));
        MessageDigest md = MessageDigest.getInstance("SHA-1"); // 选择SHA-1
        md.update(tecXml1.getBytes("UTF-8"));
        md.update(busXml1.getBytes("GBK"));
        byte[] orgDigestMsg = md.digest();
        String messageDigest = new String(Base64Encoder.encode(orgDigestMsg));
        SignaturePackege signaturePackege = new SignaturePackege();
        signaturePackege.setMessageDigest(messageDigest);
        TripPackage tripPackage = new TripPackage();
        tripPackage.setTechnology(tecXml1);
        tripPackage.setBusinessContent(busXml1);
        tripPackage.setSignature(signaturePackege);
        String tripXml = XmlUtil.convertToXml(tripPackage,"UTF-8");
        return tripXml;
    }

    //组装外层业务报文
    public static String assemblyZzsfpxt(ZzsfppxtParam param, String innerXml) throws Exception {
        String sktype = param.getSktyp();
        String data = "";
        String crc = "";
        String ysbz = "";
        if("JSP".equals(sktype)){
            /*data = new String(Base64Encoder.encode(GZIPUtils.compress(innerXml)));
            crc = Md5.digest2HEX(GZIPUtils.compress(innerXml));
            ysbz = "Y";*/
            data = new String(Base64Encoder.encode(innerXml.getBytes("GBK")));
            crc = Md5.digest2HEX(innerXml.getBytes("GBK"));
            ysbz = "N";
        }else if("SKP".equals(sktype)){
            data = new String(Base64Encoder.encode(innerXml.getBytes("GBK")));
            crc = Md5.digest2HEX(innerXml.getBytes("GBK"));
            ysbz = "N";
        }

        OuterInputInput outInput = new OuterInputInput();
        outInput.setBottomVer("");
        outInput.setNsrsbh(param.getNsrsbh());
        outInput.setKpjh(param.getKpjh());
        outInput.setSbbh(param.getSbbh());
        outInput.setYsbz(ysbz);
        outInput.setData(data);
        outInput.setCrc(crc);

        OuterInputZzsfpxt zzsfpxt = new OuterInputZzsfpxt();
        zzsfpxt.setOp_type(param.getOptype());
        zzsfpxt.setSk_type(param.getSktyp());
        zzsfpxt.setInput(outInput);
        String outerXml = XmlUtil.convertToXml(zzsfpxt);
        return outerXml;
    }

    //解析外层业务报文并验证
    public static ResultData analysisZzsfpxt(String outerXml) throws Exception {
        OuterOutputZzsfpxt zzsfpxt = XmlUtil.convertToJavaBean(outerXml,OuterOutputZzsfpxt.class);;
        ResultData resultData = new ResultData();
        String code = zzsfpxt.getResponseCode();
        if("0".equals(code)){
            OuterOutputInput input = zzsfpxt.getInput();
            String data = input.getData();
            String crc = input.getCrc();
            String ysbz = input.getYsbz();
            String innerXml = "";
            String checkCrc = "";
            if("Y".equals(ysbz)){
                innerXml = GZIPUtils.decompress(Base64Encoder.decode(data.toCharArray()));
                checkCrc = Md5.digest2HEX(GZIPUtils.compress(innerXml));
            }else{
                innerXml = Base64Encoder.decodeString(data);
                checkCrc = Md5.digest2HEX(innerXml.getBytes("GBK"));
            }
        /*if(checkCrc.equalsIgnoreCase(crc)){
            resultData.setReturnCode(code);
            resultData.setReturnMessage(zzsfpxt.getResponseMessage());
            resultData.setReturnData(innerXml);
        }else{
            resultData.setReturnCode("1");
            resultData.setReturnMessage("外层业务数据校验失败！");
        }*/
            resultData.setReturnCode(code);
            resultData.setReturnMessage(zzsfpxt.getResponseMessage());
            resultData.setReturnData(innerXml);
        }else{
            resultData.setReturnCode(code);
            resultData.setReturnMessage(zzsfpxt.getResponseMessage());
        }

        return resultData;
    }

    //解析通信报文并验证
    public static ResultData analysisTrip(String tripXml) throws Exception {
        OutputTripPackage outputTripPackage = null;
        outputTripPackage = XmlUtil.convertToJavaBean(tripXml,OutputTripPackage.class);

        //返回数据实体类
        ResultData resultData = new ResultData();

        //进行校验
        String tecXml1 = outputTripPackage.getTechnology();
        String busXml1 = outputTripPackage.getBusinessContent();
        MessageDigest md = MessageDigest.getInstance("SHA-1"); // 选择SHA-1
        md.update(tecXml1.getBytes("UTF-8"));
        md.update(busXml1.getBytes("GBK"));
        byte[] orgDigestMsg = md.digest();
        String messageDigest1 = new String(Base64Encoder.encode(orgDigestMsg));
        String messageDigest = outputTripPackage.getSignature().getMessageDigest();
        if(messageDigest.equalsIgnoreCase(messageDigest1)){
            String outerXml= Base64Encoder.decodeString(busXml1);
            resultData.setReturnCode("0");
            resultData.setReturnMessage("成功！");
            resultData.setReturnData(outerXml);
        }else{
            resultData.setReturnCode("1");
            resultData.setReturnMessage("通信报文数据校验失败！");
        }
        return resultData;
    }

    //增专增普组装通信报文
    public static String FwskAssemblyTripMessage(ZzsfppxtParam param,String innerXml) throws Exception {
        String nsrsbh = param.getNsrsbh();
        String sktype = param.getSktyp();
        String outerXml = assemblyZzsfpxt(param,innerXml);
        logger.info("外层业务报文："+outerXml);
        String tecXml = assemblyTechnologyMessage(nsrsbh,sktype);
        if("false".equals(tecXml)){
            return "false";
        }
        logger.info("技术报文："+tecXml);
        String tripXml = assemblyTripMessage(tecXml,outerXml);
        logger.info("通信报文： "+tripXml);
        return tripXml;
    }

    //增专增普解析通信报文
    public static ResultData FwskAnalysisTripMessage(String resultTrip){
        logger.info("返回通信报文： "+resultTrip);
        //解析通信报文
        ResultData tripResultData = null;
        try {
            tripResultData = analysisTrip(resultTrip);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //外层业务报文
        String resultOuterXml = null;
        if("0".equals(tripResultData.getReturnCode())){
            resultOuterXml = tripResultData.getReturnData();
        }else{
            return tripResultData;
        }
        logger.info("返回外层业务数据： "+resultOuterXml);

        //解析外层
        ResultData zzsfpxtResultData = null;
        try {
            zzsfpxtResultData = analysisZzsfpxt(resultOuterXml);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //内层业务报文
        String resultInnerXml = null;
        if("0".equals(zzsfpxtResultData.getReturnCode())){
            resultInnerXml = zzsfpxtResultData.getReturnData();
        }else{
            //返回错误信息
            return zzsfpxtResultData;
        }

        logger.info("返回内层业务报文："+resultInnerXml);
        ResultData resultData = new ResultData();
        resultData.setReturnCode("0");
        resultData.setReturnMessage("成功！");
        resultData.setReturnData(resultInnerXml);
        return resultData;
    }

    //货运组装通信报文
    public static String HyxtAnalysisTripMessage(String nsrsbh,String sktype,String innerXml) throws Exception {
        String tecXml = assemblyTechnologyMessage(nsrsbh,sktype);
        if("false".equals(tecXml)){
            return "false";
        }

        logger.info("技术报文是："+tecXml);
        String tripXml = assemblyTripMessage(tecXml,innerXml);
        logger.info("通信报文是："+tripXml);
        return tripXml;
    }

    //货运解析通信报文
    public static ResultData HyxtAnalysisTripMessage(String resultTrip){
        logger.info("返回通信报文： "+resultTrip);
        //解析通信报文
        ResultData tripResultData = null;
        try {
            tripResultData = analysisTrip(resultTrip);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //外层业务报文
        String resultOuterXml = null;
        if("0".equals(tripResultData.getReturnCode())){
            resultOuterXml = tripResultData.getReturnData();
        }else{
            return tripResultData;
        }

        logger.info("返回业务数据： "+resultOuterXml);
        ResultData resultData = new ResultData();
        resultData.setReturnCode("0");
        resultData.setReturnMessage("成功！");
        resultData.setReturnData(resultOuterXml);
        return resultData;
    }

    //货运外层报文
    public static String hyxtAssemblyRoot(String innerXml){
        String data = null;
        try {
            data = new String(Base64Encoder.encode(innerXml.getBytes("GBK")));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        RootMsg rootMsg = new RootMsg();
        rootMsg.setId("zc");
        rootMsg.setDigitalEnvelope("0");
        rootMsg.setZip("0");
        rootMsg.setContext(data);
        String outerXml = XmlUtil.convertToXml(rootMsg);
        logger.info("货运外层业务数据： "+outerXml);
        return outerXml;
    }


}
