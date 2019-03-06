package com.fjaisino.application.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fjaisino.application.common.model.error.ErrorMsg;
import com.fjaisino.application.common.model.fwsk.cxsl.request.CxslInputFpxt;
import com.fjaisino.application.common.model.fwsk.cxsl.request.CxslInputInput;
import com.fjaisino.application.common.model.fwsk.cxsl.request.FwskCxslInputData;
import com.fjaisino.application.common.model.fwsk.cxsl.response.CxslOutputFpxt;
import com.fjaisino.application.common.model.fwsk.cxsl.response.CxslOutputOutput;
import com.fjaisino.application.common.model.fwsk.fpsl.request.FpslInputFpxt;
import com.fjaisino.application.common.model.fwsk.fpsl.request.FpslInputInput;
import com.fjaisino.application.common.model.fwsk.fpsl.request.FwskFpslInputData;
import com.fjaisino.application.common.model.fwsk.fpsl.response.FpslOutputFpxt;
import com.fjaisino.application.common.model.fwsk.fpsl.response.FpslOutputOutput;
import com.fjaisino.application.common.model.fwsk.psdz.request.FwskPsdzInputData;
import com.fjaisino.application.common.model.fwsk.psdz.request.PsdzInputFpxt;
import com.fjaisino.application.common.model.fwsk.psdz.request.PsdzInputInput;
import com.fjaisino.application.common.model.fwsk.psdz.response.PsdzOutputFpxt;
import com.fjaisino.application.common.model.fwsk.psdz.response.PsdzOutputOutput;
import com.fjaisino.application.common.model.fwsk.pzhd.request.FwskPzhdInputData;
import com.fjaisino.application.common.model.fwsk.pzhd.request.PzhdInputFpxt;
import com.fjaisino.application.common.model.fwsk.pzhd.request.PzhdInputInput;
import com.fjaisino.application.common.model.fwsk.pzhd.response.PzhdOutputFpxt;
import com.fjaisino.application.common.model.fwsk.pzhd.response.PzhdOutputOutput;
import com.fjaisino.application.common.model.fwsk.ztcx.request.FwskZtcxInputData;
import com.fjaisino.application.common.model.fwsk.ztcx.request.ZtcxInputCxtj;
import com.fjaisino.application.common.model.fwsk.ztcx.request.ZtcxInputFpxt;
import com.fjaisino.application.common.model.fwsk.ztcx.request.ZtcxInputInput;
import com.fjaisino.application.common.model.fwsk.ztcx.response.ZtcxOutputFpxt;
import com.fjaisino.application.common.model.fwsk.ztcx.response.ZtcxOutputOutput;
import com.fjaisino.application.common.model.fwsk.ztcx.response.ZtcxOutputSlxx;
import com.fjaisino.application.common.model.fwsk.zzqr.request.FwskZzqrInputData;
import com.fjaisino.application.common.model.fwsk.zzqr.request.ZzqrInputFpxt;
import com.fjaisino.application.common.model.fwsk.zzqr.request.ZzqrInputInput;
import com.fjaisino.application.common.model.fwsk.zzqr.response.ZzqrOutputFpxt;
import com.fjaisino.application.common.model.fwsk.zzqr.response.ZzqrOutputOutput;
import com.fjaisino.application.common.model.hyxt.hycxsl.request.CxslInputBody;
import com.fjaisino.application.common.model.hyxt.hycxsl.request.CxslInputBusiness;
import com.fjaisino.application.common.model.hyxt.hycxsl.request.CxslInputData;
import com.fjaisino.application.common.model.hyxt.hycxsl.response.CxslOutputBody;
import com.fjaisino.application.common.model.hyxt.hycxsl.response.CxslOutputBusiness;
import com.fjaisino.application.common.model.hyxt.hyfpsl.request.FpslInputBody;
import com.fjaisino.application.common.model.hyxt.hyfpsl.request.FpslInputBusiness;
import com.fjaisino.application.common.model.hyxt.hyfpsl.request.FpslInputData;
import com.fjaisino.application.common.model.hyxt.hyfpsl.response.FpslOutputBody;
import com.fjaisino.application.common.model.hyxt.hyfpsl.response.FpslOutputBusiness;
import com.fjaisino.application.common.model.hyxt.hypzhd.request.PzhdInputBody;
import com.fjaisino.application.common.model.hyxt.hypzhd.request.PzhdInputBusiness;
import com.fjaisino.application.common.model.hyxt.hypzhd.request.PzhdInputData;
import com.fjaisino.application.common.model.hyxt.hypzhd.response.PzhdOutputBody;
import com.fjaisino.application.common.model.hyxt.hypzhd.response.PzhdOutputBusiness;
import com.fjaisino.application.common.model.hyxt.hyslqr.request.SlqrInputBody;
import com.fjaisino.application.common.model.hyxt.hyslqr.request.SlqrInputBusiness;
import com.fjaisino.application.common.model.hyxt.hyslqr.request.SlqrInputData;
import com.fjaisino.application.common.model.hyxt.hyslqr.response.SlqrOutputBody;
import com.fjaisino.application.common.model.hyxt.hyslqr.response.SlqrOutputBusiness;
import com.fjaisino.application.common.model.hyxt.hyztcx.request.ZtcxInputBody;
import com.fjaisino.application.common.model.hyxt.hyztcx.request.ZtcxInputBusiness;
import com.fjaisino.application.common.model.hyxt.hyztcx.request.ZtcxInputData;
import com.fjaisino.application.common.model.hyxt.hyztcx.response.ZtcxOutputBody;
import com.fjaisino.application.common.model.hyxt.hyztcx.response.ZtcxOutputBusiness;
import com.fjaisino.application.common.model.hyxt.hyztcx.response.ZtcxOutputSljg;
import com.fjaisino.application.common.model.hyxt.hyztcx.response.ZtcxOutputtSlxx;
import com.fjaisino.application.common.model.outmessage.InputData;
import com.fjaisino.application.common.model.outmessage.outparam.ResultData;
import com.fjaisino.application.common.model.outmessage.outparam.ZzsfppxtParam;
import com.fjaisino.application.common.model.outmessage.tripmsg.request.TripPackage;
import com.fjaisino.application.common.model.outmessage.tripmsg.response.OutputTripPackage;
import com.fjaisino.application.common.util.Base64Encoder;
import com.fjaisino.application.common.util.HttpUtil;
import com.fjaisino.application.common.util.XmlUtil;
import com.fjaisino.application.mapper.FjwsslMapper;
import com.fjaisino.application.service.FjwsslService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.util.StringUtils;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


/**
 * @program: application
 * @description:
 * @author: Mr.Peng
 * @create: 2018-12-12 21:06
 **/
@Service
public class FjwsslServiceImpl implements FjwsslService {

    private static Logger logger = Logger.getLogger(FjwsslServiceImpl.class);

    @Value("${spring.tysl.url}")
    private String tyslUrl;

    @Autowired
    private FjwsslMapper fjwsslMapper;

    


    @Override
    public String service(String inputJson) {
        logger.info("输入数据是："+inputJson );
        if(StringUtils.isEmpty(inputJson)){
            logger.error("输入数据为空！");
            return allReturnError("0001","输入数据为空！","01","输入数据为空！");
        }
        InputData inputData  = JSON.parseObject(inputJson,InputData.class);
        String optype = "";
        String sktype = "";
        if(inputData != null){
            optype = inputData.getOptype();
            sktype = inputData.getSktype();
        }else{
            logger.error("输入数据格式有误！");
            return allReturnError("0002","输入数据格式有误！","02","输入数据格式有误！");
        }

        if("0021".equals(optype) && "JSP".equals(sktype) ){
            logger.info("发票申领申请接口（0021 增专普）");
            String outputJson = wsslFpsl(inputJson);
            return outputJson;
        }else if("0022".equals(optype) && "JSP".equals(sktype)){
            logger.info("发票申领状态查询接口（0022 增专普）");
            String outputJson = wsslZtcx(inputJson);
            return outputJson;
        }else if("0023".equals(optype) && "JSP".equals(sktype)){
            logger.info("票种核定信息查询接口（0023 增专普）");
            String outputJson = wsslPzhd(inputJson);
            return outputJson;
        }else if("0038".equals(optype) && "JSP".equals(sktype)){
            logger.info("申领纸质发票确认接口（专普）（0038）");
            String outputJson = wsslSlqr(inputJson);
            return outputJson;
        }else if("0041".equals(optype) && "JSP".equals(sktype)){
            logger.info("撤销网上申领（专普0041）");
            String outputJson = wsslCxsl(inputJson);
            return outputJson;
        }else if("0024".equals(optype) && "SKP".equals(sktype)){
            logger.info("发票申领（0024 货运）");
            String outputJson = hyxtFpsl(inputJson);
            return outputJson;
        }else if("0025".equals(optype) && "SKP".equals(sktype)){
            logger.info("发票申领状态查询（0025 货运）");
            String outputJson = hyxtFpslcx(inputJson);
            return outputJson;
        }else if("0026".equals(optype) && "SKP".equals(sktype)){
            logger.info("票种核定信息查询（0026 货运）");
            String outputJson = hyxtPzhd(inputJson);
            return outputJson;
        }else if("0039".equals(optype) && "SKP".equals(sktype)){
            logger.info("申领确认（0039 货运）");
            String outputJson = hyxtSlqr(inputJson);
            return outputJson;
        }else if("0042".equals(optype) && "SKP".equals(sktype)){
            logger.info("撤销申领（0042 货运）");
            String outputJson = hyxtSlcx(inputJson);
            return outputJson;
        }else if("0044".equals(optype) && "JSP".equals(sktype)){
            logger.info("从征管获取配送地址(0044)");
            String outputJson = wsslPsdz(inputJson);
            return outputJson;
        }else{
            logger.error("输入的optype或sktype有误！");
            return allReturnError("0002","输入的optype或sktype有误！","02","输入的optype或sktype有误！");
        }

    }

    //撤销网上申领（专普0041）
    public String wsslCxsl(String inputJson){
        FwskCxslInputData cxslInputData = JSON.parseObject(inputJson,FwskCxslInputData.class);
        CxslInputInput input = cxslInputData.getData();

        //input.setSlxh("");

        String optype = cxslInputData.getOptype();
        String sktype = cxslInputData.getSktype();
        String nsrsbh = input.getNsrsbh();

        CxslInputFpxt fpxt = new CxslInputFpxt();
        fpxt.setInput(input);
        String innerXml = XmlUtil.convertToXml(fpxt);
        logger.info("内层业务报文："+innerXml);


        ZzsfppxtParam zzsfppxtParam = new ZzsfppxtParam();
        zzsfppxtParam.setOptype(optype);
        zzsfppxtParam.setSktyp(sktype);
        zzsfppxtParam.setNsrsbh(nsrsbh);
        zzsfppxtParam.setKpjh("0");
        zzsfppxtParam.setSbbh("");

        String tripXml = null;
        try {
            tripXml = AnalysisData.FwskAssemblyTripMessage(zzsfppxtParam,innerXml);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if("false".equals(tripXml)){
            logger.error("组装通信报文时错误！");
            return fwskReturnError("0003","组装通信报文时错误！");
        }
        logger.info("通信报文： "+tripXml);
        //开始发送http请求
        /*MultiValueMap<String,String> param1 = new LinkedMultiValueMap<>();
        param1.add("data",tripXml);*/
        String resultTrip = null;
        try{
            //resultTrip = HttpUtil.sendPostRequest(tyslUrl,param1);
            resultTrip = HttpUtil.sendPostRequest(tyslUrl,tripXml);
        }catch (Exception e){
            return fwskReturnError("0006","连接统一受理平台失败！");
        }
        //String resultTrip = HttpUtil.sendPostRequest(tyslUrl,param1);
        if(StringUtils.isEmpty(resultTrip)){
            logger.error("返回数据为空！");
            return fwskReturnError("0004","返回数据为空！");
        }

        ResultData resultData = AnalysisData.FwskAnalysisTripMessage(resultTrip);
        String resultInnerXml = null;
        if("0".equals(resultData.getReturnCode())){
            resultInnerXml = resultData.getReturnData();
        }else{
            //返回错误信息
            logger.error(resultData.getReturnMessage());
            return fwskReturnError("0005",resultData.getReturnMessage());
        }

       /* MultiValueMap<String,String> param1 = new LinkedMultiValueMap<>();
        param1.add("data",innerXml);
        String result = HttpUtil.sendPostRequest(tyslUrl,param1);
        logger.info("返回业务报文："+result);*/

        //解析输出报文
        CxslOutputFpxt cxslOutputFpxt = null;

        try {
            cxslOutputFpxt =  XmlUtil.convertToJavaBean(resultInnerXml,CxslOutputFpxt.class);
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        CxslOutputOutput cxslOutputOutput = cxslOutputFpxt.getOutput();
        String outJson = JSONObject.toJSONString(cxslOutputOutput);
        return outJson;
    }

    //发票申领申请接口（0021 增专普）
    public String wsslFpsl(String inputJson){
        FwskFpslInputData fpslInputData = JSON.parseObject(inputJson,FwskFpslInputData.class);
        FpslInputInput input = fpslInputData.getData();

        String optype = fpslInputData.getOptype();
        String sktype = fpslInputData.getSktype();
        String nsrsbh = input.getNsrsbh();

        //设备编号默认是0
        input.setKpjh("0");
        input.setSbbh("");
        input.setDcbb("");

        FpslInputFpxt fpxt = new FpslInputFpxt();
        fpxt.setInput(input);
        String innerXml = XmlUtil.convertToXml(fpxt);
        logger.info("内层业务报文："+innerXml);

        ZzsfppxtParam zzsfppxtParam = new ZzsfppxtParam();
        zzsfppxtParam.setOptype(optype);
        zzsfppxtParam.setSktyp(sktype);
        zzsfppxtParam.setNsrsbh(nsrsbh);
        zzsfppxtParam.setKpjh("0");
        zzsfppxtParam.setSbbh("");

        String tripXml = null;
        try {
            tripXml = AnalysisData.FwskAssemblyTripMessage(zzsfppxtParam,innerXml);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if("false".equals(tripXml)){
            logger.error("组装通信报文时错误！");
            return fwskReturnError("0003","组装通信报文时错误！");
        }
        logger.info("通信报文： "+tripXml);
        //开始发送http请求
        /*MultiValueMap<String,String> param1 = new LinkedMultiValueMap<>();
        param1.add("data",tripXml);*/
        String resultTrip = null;
        try{
            //resultTrip = HttpUtil.sendPostRequest(tyslUrl,param1);
            resultTrip = HttpUtil.sendPostRequest(tyslUrl,tripXml);
        }catch (Exception e){
            e.printStackTrace();
            return fwskReturnError("0006","连接统一受理平台失败！");
        }
        //String resultTrip = HttpUtil.sendPostRequest(tyslUrl,param1);
        if(StringUtils.isEmpty(resultTrip)){
            logger.error("返回数据为空！");
            return fwskReturnError("0004","返回数据为空！");
        }

       ResultData resultData = AnalysisData.FwskAnalysisTripMessage(resultTrip);
       String resultInnerXml = null;
       if("0".equals(resultData.getReturnCode())){
           resultInnerXml = resultData.getReturnData();
       }else{
           //返回错误信息
           logger.error(resultData.getReturnMessage());
           return fwskReturnError("0005",resultData.getReturnMessage());
       }


       /* //开始发送http请求
        MultiValueMap<String,String> param1 = new LinkedMultiValueMap<>();
        param1.add("data",innerXml);
        String resultInnerXml = HttpUtil.sendPostRequest(tyslUrl,param1);
        logger.info("返回业务报文："+resultInnerXml);*/


        //解析输出报文
        FpslOutputFpxt fpslOutputFpxt = null;
        try {
            fpslOutputFpxt = XmlUtil.convertToJavaBean(resultInnerXml,FpslOutputFpxt.class);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        FpslOutputOutput fpslOutputOutput = fpslOutputFpxt.getOutput();
        String outJson = JSONObject.toJSONString(fpslOutputOutput);

        return outJson;
    }

    //发票申领状态查询接口（0022 增专普）
    public String wsslZtcx(String inputJson){
        FwskZtcxInputData ztcxInputData = JSON.parseObject(inputJson,FwskZtcxInputData.class);
        ZtcxInputInput input = ztcxInputData.getData();

        String optype = ztcxInputData.getOptype();
        String sktype = ztcxInputData.getSktype();
        String nsrsbh = input.getNsrsbh();

        //设备编号默认是0
        input.setKpjh("0");
        input.setSbbh("");
        input.setDcbb("");

        //查询条件中，申请起始日期和申请截止日期格式转换
        ZtcxInputCxtj cxtj = input.getCxtj();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date qsrq = null;
        Date jzrq = null;
        try {
             qsrq = sdf.parse(cxtj.getQsrq());
             jzrq = sdf.parse(cxtj.getJzrq());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyyMMdd");
        String qsrq1 = sdf1.format(qsrq);
        String jzrq1 = sdf1.format(jzrq);
        cxtj.setQsrq(qsrq1);
        cxtj.setJzrq(jzrq1);

        cxtj.setSlxh("");

        ZtcxInputFpxt fpxt = new ZtcxInputFpxt();
        fpxt.setInput(input);

        String innerXml = XmlUtil.convertToXml(fpxt);
        logger.info("内层业务报文："+innerXml);


        ZzsfppxtParam zzsfppxtParam = new ZzsfppxtParam();
        zzsfppxtParam.setOptype(optype);
        zzsfppxtParam.setSktyp(sktype);
        zzsfppxtParam.setNsrsbh(nsrsbh);
        zzsfppxtParam.setKpjh("0");
        zzsfppxtParam.setSbbh("");

        String tripXml = null;
        try {
            tripXml = AnalysisData.FwskAssemblyTripMessage(zzsfppxtParam,innerXml);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if("false".equals(tripXml)){
            logger.error("组装通信报文时错误！");
            return fwskReturnError("0003","组装通信报文时错误！");
        }
        logger.info("通信报文： "+tripXml);
        //开始发送http请求
        /*MultiValueMap<String,String> param1 = new LinkedMultiValueMap<>();
        param1.add("data",tripXml);*/
        String resultTrip = null;
        try{
            //resultTrip = HttpUtil.sendPostRequest(tyslUrl,param1);
            resultTrip = HttpUtil.sendPostRequest(tyslUrl,tripXml);
        }catch (Exception e){
            return fwskReturnError("0006","连接统一受理平台失败！");
        }

        //String resultTrip = HttpUtil.sendPostRequest(tyslUrl,param1);
        if(StringUtils.isEmpty(resultTrip)){
            logger.error("返回数据为空！");
            return fwskReturnError("0004","返回数据为空！");
        }

        ResultData resultData = AnalysisData.FwskAnalysisTripMessage(resultTrip);
        String resultInnerXml = null;
        if("0".equals(resultData.getReturnCode())){
            resultInnerXml = resultData.getReturnData();
        }else{
            //返回错误信息
            logger.error(resultData.getReturnMessage());
            return fwskReturnError("0005",resultData.getReturnMessage());
        }


        /*//开始发送http请求
        MultiValueMap<String,String> param1 = new LinkedMultiValueMap<>();
        param1.add("data",innerXml);
        String result = HttpUtil.sendPostRequest(tyslUrl,param1);
        logger.info("返回业务报文："+result);*/

        //解析输出报文
        ZtcxOutputFpxt ztcxOutputFpxt = null;
        try {
            ztcxOutputFpxt = XmlUtil.convertToJavaBean(resultInnerXml,ZtcxOutputFpxt.class);
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        ZtcxOutputOutput ztcxOutputOutput = ztcxOutputFpxt.getOutput();

        //申请时间格式转换
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
        List<ZtcxOutputSlxx> slxxes = ztcxOutputOutput.getData().getSlxxes();
        if(slxxes != null){
            for(int i=0;i<slxxes.size();i++){
                String sqsj = slxxes.get(i).getSqsj();
                if(!StringUtils.isEmpty(sqsj)){
                    Date sqsj1 =null;
                    try {
                        sqsj1 = sdf1.parse(sqsj);
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    String sqsj2 = sdf2.format(sqsj1);
                    slxxes.get(i).setSqsj(sqsj2);
                }


                String clsj = slxxes.get(i).getClsj();
                if(!StringUtils.isEmpty(clsj)){
                    Date clsj1 = null;
                    try {
                        clsj1 = sdf1.parse(clsj);
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    String clsj2 = sdf2.format(clsj1);
                    slxxes.get(i).setClsj(clsj2);
                }


                //获取邮寄单号
                String slxh = slxxes.get(i).getSlxh();
                List<String> kddhs =  fjwsslMapper.getFwskKdhh(slxh);
                slxxes.get(i).setKddhs(kddhs);
            }
        }

        String outJson = JSONObject.toJSONString(ztcxOutputOutput);
        return outJson;

    }

    //票种核定信息查询接口（0023 增专普）
    public String wsslPzhd(String inputJson){
        FwskPzhdInputData pzhdInputData = JSON.parseObject(inputJson,FwskPzhdInputData.class);
        PzhdInputInput input = pzhdInputData.getData();

        String optype = pzhdInputData.getOptype();
        String sktype = pzhdInputData.getSktype();
        String nsrsbh = input.getNsrsbh();

        //设备编号默认是0
        input.setKpjh("0");
        input.setSbbh("");
        input.setDcbb("");

        PzhdInputFpxt fpxt = new PzhdInputFpxt();
        fpxt.setInput(input);

        String innerXml = XmlUtil.convertToXml(fpxt);
        logger.info("内层业务报文："+innerXml);

        ZzsfppxtParam zzsfppxtParam = new ZzsfppxtParam();
        zzsfppxtParam.setOptype(optype);
        zzsfppxtParam.setSktyp(sktype);
        zzsfppxtParam.setNsrsbh(nsrsbh);
        zzsfppxtParam.setKpjh("0");
        zzsfppxtParam.setSbbh("");

        String tripXml = null;
        try {
            tripXml = AnalysisData.FwskAssemblyTripMessage(zzsfppxtParam,innerXml);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if("false".equals(tripXml)){
            logger.error("组装通信报文时错误！");
            return fwskReturnError("0003","组装通信报文时错误！");
        }
        logger.info("通信报文： "+tripXml);
        //开始发送http请求
        /*MultiValueMap<String,String> param1 = new LinkedMultiValueMap<>();
        param1.add("data",tripXml);*/
        String resultTrip = null;
        try{
            //resultTrip = HttpUtil.sendPostRequest(tyslUrl,param1);
            resultTrip = HttpUtil.sendPostRequest(tyslUrl,tripXml);
        }catch (Exception e){
            return fwskReturnError("0006","连接统一受理平台失败！");
        }

        //String resultTrip = HttpUtil.sendPostRequest(tyslUrl,param1);
        if(StringUtils.isEmpty(resultTrip)){
            logger.error("返回数据为空！");
            return fwskReturnError("0004","返回数据为空！");
        }

        ResultData resultData = AnalysisData.FwskAnalysisTripMessage(resultTrip);
        String resultInnerXml = null;
        if("0".equals(resultData.getReturnCode())){
            resultInnerXml = resultData.getReturnData();
        }else{
            //返回错误信息
            logger.error(resultData.getReturnMessage());
            return fwskReturnError("0005",resultData.getReturnMessage());
        }

       /* //开始发送http请求
        MultiValueMap<String,String> param1 = new LinkedMultiValueMap<>();
        param1.add("data",innerXml);
        String result = HttpUtil.sendPostRequest(tyslUrl,param1);
        logger.info("返回业务报文："+result);*/

        //解析输出报文
        PzhdOutputFpxt pzhdOutputFpxt = null;

        try {
            pzhdOutputFpxt = XmlUtil.convertToJavaBean(resultInnerXml,PzhdOutputFpxt.class);
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        PzhdOutputOutput pzhdOutputOutput = pzhdOutputFpxt.getOutput();
        String outJson = JSONObject.toJSONString(pzhdOutputOutput);
        return outJson;
    }

    //申领纸质发票确认接口（专普）（0038）
    public String wsslSlqr(String inputJson){
        FwskZzqrInputData zzqrInputData = JSON.parseObject(inputJson,FwskZzqrInputData.class);
        ZzqrInputInput input = zzqrInputData.getData();

        //input.setSlxh("");

        String optype = zzqrInputData.getOptype();
        String sktype = zzqrInputData.getSktype();
        String nsrsbh = input.getNsrsbh();

        ZzqrInputFpxt fpxt = new ZzqrInputFpxt();
        fpxt.setInput(input);

        String innerXml = XmlUtil.convertToXml(fpxt);
        logger.info("内层业务报文："+innerXml);

        ZzsfppxtParam zzsfppxtParam = new ZzsfppxtParam();
        zzsfppxtParam.setOptype(optype);
        zzsfppxtParam.setSktyp(sktype);
        zzsfppxtParam.setNsrsbh(nsrsbh);
        zzsfppxtParam.setKpjh("0");
        zzsfppxtParam.setSbbh("");

        String tripXml = null;
        try {
            tripXml = AnalysisData.FwskAssemblyTripMessage(zzsfppxtParam,innerXml);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if("false".equals(tripXml)){
            logger.error("组装通信报文时错误！");
            return fwskReturnError("0003","组装通信报文时错误！");
        }
        logger.info("通信报文： "+tripXml);
        //开始发送http请求
        /*MultiValueMap<String,String> param1 = new LinkedMultiValueMap<>();
        param1.add("data",tripXml);*/
        String resultTrip = null;
        try{
            //resultTrip = HttpUtil.sendPostRequest(tyslUrl,param1);
            resultTrip = HttpUtil.sendPostRequest(tyslUrl,tripXml);
        }catch (Exception e){
            return fwskReturnError("0006","连接统一受理平台失败！");
        }

        //String resultTrip = HttpUtil.sendPostRequest(tyslUrl,param1);
        if(StringUtils.isEmpty(resultTrip)){
            logger.error("返回数据为空！");
            return fwskReturnError("0004","返回数据为空！");
        }

        ResultData resultData = AnalysisData.FwskAnalysisTripMessage(resultTrip);
        String resultInnerXml = null;
        if("0".equals(resultData.getReturnCode())){
            resultInnerXml = resultData.getReturnData();
        }else{
            //返回错误信息
            logger.error(resultData.getReturnMessage());
            return fwskReturnError("0005",resultData.getReturnMessage());
        }

       /* //开始发送http请求
        MultiValueMap<String,String> param1 = new LinkedMultiValueMap<>();
        param1.add("data",innerXml);
        String result = HttpUtil.sendPostRequest(tyslUrl,param1);
        logger.info("返回业务报文："+result);
*/
        //解析输出报文
        ZzqrOutputFpxt zzqrOutputFpxt = null;

        try {
            zzqrOutputFpxt = XmlUtil.convertToJavaBean(resultInnerXml,ZzqrOutputFpxt.class);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        ZzqrOutputOutput zzqrOutputOutput = zzqrOutputFpxt.getOutput();

        String outJson = JSONObject.toJSONString(zzqrOutputOutput);
        return outJson;

    }

    //从征管获取配送地址(0044)
    public String wsslPsdz(String inputJson){
        FwskPsdzInputData psdzInputData = JSON.parseObject(inputJson,FwskPsdzInputData.class);
        PsdzInputInput input = psdzInputData.getData();

        String optype = psdzInputData.getOptype();
        String sktype = psdzInputData.getSktype();
        String nsrsbh = input.getNsrsbh();

        PsdzInputFpxt fpxt = new PsdzInputFpxt();
        fpxt.setInput(input);

        String innerXml = XmlUtil.convertToXml(fpxt);
        logger.info("内层业务报文："+innerXml);

        ZzsfppxtParam zzsfppxtParam = new ZzsfppxtParam();
        zzsfppxtParam.setOptype(optype);
        zzsfppxtParam.setSktyp(sktype);
        zzsfppxtParam.setNsrsbh(nsrsbh);
        zzsfppxtParam.setKpjh("0");
        zzsfppxtParam.setSbbh("");

        String tripXml = null;
        try {
            tripXml = AnalysisData.FwskAssemblyTripMessage(zzsfppxtParam,innerXml);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if("false".equals(tripXml)){
            logger.error("组装通信报文时错误！");
            return fwskReturnError("0003","组装通信报文时错误！");
        }
        logger.info("通信报文： "+tripXml);
        String resultTrip = null;
        try{
            //resultTrip = HttpUtil.sendPostRequest(tyslUrl,param1);
            resultTrip = HttpUtil.sendPostRequest(tyslUrl,tripXml);
        }catch (Exception e){
            e.printStackTrace();
            return fwskReturnError("0006","连接统一受理平台失败！");
        }

        if(StringUtils.isEmpty(resultTrip)){
            logger.error("返回数据为空！");
            return fwskReturnError("0004","返回数据为空！");
        }

        ResultData resultData = AnalysisData.FwskAnalysisTripMessage(resultTrip);
        String resultInnerXml = null;
        if("0".equals(resultData.getReturnCode())){
            resultInnerXml = resultData.getReturnData();
        }else{
            //返回错误信息
            logger.error(resultData.getReturnMessage());
            return fwskReturnError("0005",resultData.getReturnMessage());
        }
        //解析输出报文
        PsdzOutputFpxt psdzOutputFpxt = null;

        try {
            psdzOutputFpxt = XmlUtil.convertToJavaBean(resultInnerXml,PsdzOutputFpxt.class);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        PsdzOutputOutput psdzOutputOutput = psdzOutputFpxt.getOutput();
        String outJson = JSONObject.toJSONString(psdzOutputOutput);
        return outJson;
    }

	
    /*************************************货运系统*************************************/

    /**
     * 1 票种核定接口输入报文（0026 货运）
     * @param inputJson
     * @return
     */
    public String hyxtPzhd(String inputJson){

        //获取前端json串
        PzhdInputData pzhdInputData = JSON.parseObject(inputJson,PzhdInputData.class);

        //获取data节点下的body数据
        PzhdInputBody pzhdInputBody = pzhdInputData.getData();

        //创建business节点对象
        PzhdInputBusiness business = new PzhdInputBusiness();

        //将input数据加上最外层fpxt加点
        business.setId("fp_zltb");
        business.setComment("发票种类同步");
        business.setBody(pzhdInputBody);

        //生成业务报文xml
        String innerXml = XmlUtil.convertToXml(business);
        logger.info("业务报文内层：" + innerXml);

        //生成技术报文xml
        String technologyXml = AnalysisData.assemblyTechnologyMessage(pzhdInputBody.getNsrsbh(),pzhdInputData.getSktype());
        logger.info("生成技术报文xml：" + technologyXml);

        //组装通信报文xml
        String tcmXml = null;
        try {
            tcmXml = AnalysisData.assemblyTripMessage(technologyXml,innerXml);
        } catch (Exception e) {
            e.printStackTrace();
        }
        logger.info("组装通信报文xml：" + tcmXml);


        //发送http请求并获取受理返回通信xml报文
        String result = null;
        try{
            result = HttpUtil.sendPostRequest(tyslUrl,tcmXml);
        }catch (Exception e){
            return hyxtReturnError("0006","连接统一受理平台失败！");
        }

        if(StringUtils.isEmpty(result)){
            return hyxtReturnError("0004","没有获取受理返回的通信报文");
        }
        logger.info("获取受理返回通信xml：" + result);

        //将通信报文转成java对象
        OutputTripPackage outputTripPackage = null;
        try {
            outputTripPackage = XmlUtil.convertToJavaBean(result,OutputTripPackage.class);
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        //解析业务密文
        String businessContent = Base64Encoder.decodeString(outputTripPackage.getBusinessContent());
        logger.info("解密返回业务报文：" + businessContent);

        //将业务报文转换成java对象
        PzhdOutputBusiness pzhdOutputBusiness = null;
        try {
            pzhdOutputBusiness = XmlUtil.convertToJavaBean(businessContent,PzhdOutputBusiness.class);
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        //将body层xml转换成json返回给前端
        PzhdOutputBody pzhdOutputBody = null;
        pzhdOutputBody = pzhdOutputBusiness.getBody();
        String outJson = JSONObject.toJSONString(pzhdOutputBody);
        return outJson;

    }

    /**
     * 2 发票申领输入报文（0024 货运）
     * @param inputJson
     * @return
     */
    public String hyxtFpsl(String inputJson){

        //获取前端json串
        FpslInputData fpslInputData = JSON.parseObject(inputJson,FpslInputData.class);
        logger.info(fpslInputData);


        //获取data节点下的body数据
        FpslInputBody fpslInputBody = fpslInputData.getData();
        fpslInputBody.setPh("0");

        //将字符串转成时间
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date slsj1 = null;
        try {
            slsj1 = sdf1.parse(fpslInputBody.getSlsj());
        } catch (ParseException e) {
            e.printStackTrace();
        }

        //将时间转换成字符串
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyyMMdd");
        String slsj2 = sdf2.format(slsj1);
        fpslInputBody.setSlsj(slsj2);

        //创建business节点对象
        FpslInputBusiness business = new FpslInputBusiness();

        //将input数据加上最外层fpxt加点
        business.setId("fp_sl");
        business.setComment("发票申领");
        business.setBody(fpslInputBody);

        //生成业务报文xml
        String innerXml = XmlUtil.convertToXml(business);
        logger.info("生成业务报文xml：" + innerXml);

        //生成技术报文xml
        String technologyXml = AnalysisData.assemblyTechnologyMessage(fpslInputBody.getNsrsbh(),fpslInputData.getSktype());
        logger.info("生成技术报文xml：" + technologyXml);

        //组装通信报文xml
        String tcmXml = null;
        try {
            tcmXml = AnalysisData.assemblyTripMessage(technologyXml,innerXml);
        } catch (Exception e) {
            e.printStackTrace();
        }
        logger.info("组装通信报文xml：" + tcmXml);

        /*//将通信报文存入map集合
        MultiValueMap<String,String> param1 = new LinkedMultiValueMap<>();
        param1.add("data",tcmXml);

        //发送http请求并获取受理返回通信xml报文
        String result = HttpUtil.sendPostRequest(tyslUrl,param1);*/
        //发送http请求并获取受理返回通信xml报文
        String result = null;
        try{
            result = HttpUtil.sendPostRequest(tyslUrl,tcmXml);
        }catch (Exception e){
            return hyxtReturnError("0006","连接统一受理平台失败！");
        }
        if(StringUtils.isEmpty(result)){
            return hyxtReturnError("0004","没有获取受理返回的通信报文");
        }
        logger.info("获取受理返回通信xml：" + result);

        //将通信报文转成java对象
        OutputTripPackage outputTripPackage = null;
        try {
            outputTripPackage = XmlUtil.convertToJavaBean(result,OutputTripPackage.class);
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        //解析业务密文
        String businessContent = Base64Encoder.decodeString(outputTripPackage.getBusinessContent());
        logger.info("解密返回业务报文：" + businessContent);

        //将业务报文转换成java对象
        FpslOutputBusiness fpslOutputBusiness = null;
        try {
            fpslOutputBusiness = XmlUtil.convertToJavaBean(businessContent,FpslOutputBusiness.class);
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        //将body层xml转换成json返回给前端
        FpslOutputBody fpslOutputBody = null;
        fpslOutputBody = fpslOutputBusiness.getBody();
        String returnCode = fpslOutputBody.getReturnCode();
        if(returnCode == "00"&& !StringUtils.isEmpty(fpslOutputBody.getTime())) {
            Date time = null;
            try {
                time = sdf1.parse(fpslOutputBody.getTime());
            } catch (ParseException e) {
                e.printStackTrace();
            }
            SimpleDateFormat sdf3 = new SimpleDateFormat("yyyyMMddHHmmss");
            String time2 = sdf3.format(time);
            fpslOutputBody.setTime(time2);
        }

        String outJson = JSONObject.toJSONString(fpslOutputBody);
        return outJson;
    }

    /**
     * 3 发票申领状态查询（0025 货运）
     * @param inputJson
     * @return
     */
    public String hyxtFpslcx(String inputJson) {

        //获取前端json串
        ZtcxInputData ztcxInputData = JSON.parseObject(inputJson,ZtcxInputData.class);

        //获取data节点下的body数据
        ZtcxInputBody ztcxInputBody = ztcxInputData.getData();
        ztcxInputBody.setSlxh("");
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date slqssj1 = null;
        Date sljzsj1 = null;
        try {
            slqssj1 = sdf1.parse(ztcxInputBody.getSlqssj());
            sljzsj1 = sdf1.parse(ztcxInputBody.getSljzsj());
        } catch (ParseException e) {
            e.printStackTrace();
        }

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyyMMdd");
        String slqssj2 = sdf2.format(slqssj1);
        String sljzsj2 = sdf2.format(sljzsj1);
        ztcxInputBody.setSlqssj(slqssj2);
        ztcxInputBody.setSljzsj(sljzsj2);

        //创建business节点对象
        ZtcxInputBusiness business = new ZtcxInputBusiness();

        //将input数据加上最外层fpxt加点
        business.setId("fp_sljg");
        business.setComment("发票申领结果");
        business.setBody(ztcxInputBody);

        //生成业务报文xml
        String innerXml = XmlUtil.convertToXml(business);
        logger.info("业务报文内层：" + innerXml);

        //生成技术报文xml
        String technologyXml = AnalysisData.assemblyTechnologyMessage(ztcxInputBody.getNsrsbh(),ztcxInputData.getSktype());
        logger.info("生成技术报文xml：" + technologyXml);

        //组装通信报文xml
        String tcmXml = null;
        try {
            tcmXml = AnalysisData.assemblyTripMessage(technologyXml,innerXml);
        } catch (Exception e) {
            e.printStackTrace();
        }
        logger.info("组装通信报文xml：" + tcmXml);

        /*//将通信报文存入map集合
        MultiValueMap<String,String> param1 = new LinkedMultiValueMap<>();
        param1.add("data",tcmXml);

        //发送http请求并获取受理返回通信xml报文
        String result = HttpUtil.sendPostRequest(tyslUrl,param1);*/

        //发送http请求并获取受理返回通信xml报文
        String result = null;
        try{
            result = HttpUtil.sendPostRequest(tyslUrl,tcmXml);
        }catch (Exception e){
            return hyxtReturnError("0006","连接统一受理平台失败！");
        }
        if(StringUtils.isEmpty(result)){
            return hyxtReturnError("0004","没有获取受理返回的通信报文");
        }
        logger.info("获取受理返回通信xml：" + result);

        //将通信报文转成java对象
        OutputTripPackage outputTripPackage = null;
        try {
            outputTripPackage = XmlUtil.convertToJavaBean(result,OutputTripPackage.class);
        } catch (JAXBException e) {
            e.printStackTrace();
        }


        //解析业务密文
        String businessContent = Base64Encoder.decodeString(outputTripPackage.getBusinessContent());
        logger.info("解密返回业务报文：" + businessContent);

        //将业务报文转换成java对象
        ZtcxOutputBusiness ztcxOutputBusiness = null;
        try {
            ztcxOutputBusiness = XmlUtil.convertToJavaBean(businessContent,ZtcxOutputBusiness.class);
            //ztcxOutputBusiness = XmlUtil.convertToJavaBean(result,ZtcxOutputBusiness.class);
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        //将body层xml转换成json返回给前端
        ZtcxOutputBody ztcxOutputBody = null;
        ztcxOutputBody = ztcxOutputBusiness.getBody();

        ZtcxOutputtSlxx ztcxOutputtSlxx = null;
        ztcxOutputtSlxx = ztcxOutputBody.getSlxx();
        if (ztcxOutputtSlxx != null){

            List<ZtcxOutputSljg> ztcxOutputSljgList = ztcxOutputtSlxx.getSljgs();
            if(ztcxOutputSljgList != null){
                for(ZtcxOutputSljg sljg : ztcxOutputSljgList) {
                    String slxh = sljg.getSlxh();
                    List<String> kddhList = fjwsslMapper.selectkddhs(slxh);
                    sljg.setKddhs(kddhList);
                    if(!StringUtils.isEmpty(sljg.getSlsj()) && !StringUtils.isEmpty(sljg.getClsj())){
                        Date slsj1 = null;
                        Date clsj1 = null;
                        try {
                            slsj1 = sdf2.parse(sljg.getSlsj());
                            clsj1 = sdf2.parse(sljg.getClsj());
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd");
                        String slsj2 = sdf3.format(slsj1);
                        String clsj2 = sdf3.format(clsj1);
                        sljg.setSlsj(slsj2);
                        sljg.setClsj(clsj2);
                    }

                }
            }


        }

        String outJson = JSONObject.toJSONString(ztcxOutputBody);
        return outJson;
    }

    /**
     * 4 申领确认（0039 货运）
     * @param inputJson
     * @return
     */
    public String hyxtSlqr(String inputJson){

        //获取前端json串
        SlqrInputData slqrInputData = JSON.parseObject(inputJson,SlqrInputData.class);

        //获取data节点下的body数据
        SlqrInputBody slqrInputBody = slqrInputData.getData();
        //slqrInputBody.setSlxh("");

        //创建business节点对象
        SlqrInputBusiness business = new SlqrInputBusiness();

        //将input数据加上最外层fpxt加点
        business.setId("fp_jsqr");
        business.setComment("纸质票接收确认");
        business.setBody(slqrInputBody);

        //生成业务报文xml
        String innerXml = XmlUtil.convertToXml(business);
        logger.info("业务报文内层：" + innerXml);

        //生成外层业务报文
        String outXml = AnalysisData.hyxtAssemblyRoot(innerXml);
        logger.info("业务报文外层：" + outXml);

        //生成技术报文xml
        String technologyXml = AnalysisData.assemblyTechnologyMessage(slqrInputBody.getNsrsbh(),slqrInputData.getSktype());
        logger.info("生成技术报文xml：" + technologyXml);

        //组装通信报文xml
        String tcmXml = null;
        try {
            tcmXml = AnalysisData.assemblyTripMessage(technologyXml,outXml);
        } catch (Exception e) {
            e.printStackTrace();
        }
        logger.info("组装通信报文xml：" + tcmXml);

        /*//将通信报文存入map集合
        MultiValueMap<String,String> param1 = new LinkedMultiValueMap<>();
        param1.add("data",tcmXml);

        //发送http请求并获取受理返回通信xml报文
        String result = HttpUtil.sendPostRequest(tyslUrl,param1);*/
        //发送http请求并获取受理返回通信xml报文
        String result = null;
        try{
            result = HttpUtil.sendPostRequest(tyslUrl,tcmXml);
        }catch (Exception e){
            return hyxtReturnError("0006","连接统一受理平台失败！");
        }
        if(StringUtils.isEmpty(result)){
            return hyxtReturnError("0004","没有获取受理返回的通信报文");
        }
        logger.info("获取受理返回通信xml：" + result);

        //将通信报文转成java对象
        OutputTripPackage outputTripPackage = null;
        try {
            outputTripPackage = XmlUtil.convertToJavaBean(result,OutputTripPackage.class);
        } catch (JAXBException e) {
            e.printStackTrace();
        }


        //解析业务密文
        String businessContent = Base64Encoder.decodeString(outputTripPackage.getBusinessContent());
        logger.info("解密返回业务报文：" + businessContent);

        //将业务报文转换成java对象
        SlqrOutputBusiness slqrOutputBusiness = null;
        try {
            slqrOutputBusiness = XmlUtil.convertToJavaBean(businessContent,SlqrOutputBusiness.class);
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        //将body层xml转换成json返回给前端
        SlqrOutputBody slqrOutputBody = null;
        slqrOutputBody = slqrOutputBusiness.getBody();
        String outJson = JSONObject.toJSONString(slqrOutputBody);
        return outJson;
    }

    /**
     * 5 撤销申领（0042 货运）
     * @param inputJson
     * @return
     */
    public String hyxtSlcx(String inputJson){

        //获取前端json串
         CxslInputData cxslInputData = JSON.parseObject(inputJson,CxslInputData.class);

        //获取data节点下的body数据
        CxslInputBody cxslInputBody = cxslInputData.getData();
        //cxslInputBody.setSlxh("");

        //创建business节点对象
        CxslInputBusiness business = new CxslInputBusiness();

        //将input数据加上最外层fpxt加点
        business.setId("fp_cxsl");
        business.setComment("撤销网上申领");
        business.setBody(cxslInputBody);

        //生成业务报文xml
        String innerXml = XmlUtil.convertToXml(business);
        logger.info("业务报文内层：" + innerXml);

        //生成外层业务报文
        String outXml = AnalysisData.hyxtAssemblyRoot(innerXml);
        logger.info("业务报文外层：" + outXml);

        //生成技术报文xml
        String technologyXml = AnalysisData.assemblyTechnologyMessage(cxslInputBody.getNsrsbh(),cxslInputData.getSktype());
        logger.info("生成技术报文xml：" + technologyXml);

        //组装通信报文xml
        String tcmXml = null;
        try {
            tcmXml = AnalysisData.assemblyTripMessage(technologyXml,outXml);
        } catch (Exception e) {
            e.printStackTrace();
        }
        logger.info("组装通信报文xml：" + tcmXml);

        /*//将通信报文存入map集合
        MultiValueMap<String,String> param1 = new LinkedMultiValueMap<>();
        param1.add("data",tcmXml);

        //发送http请求并获取受理返回通信xml报文
        String result = HttpUtil.sendPostRequest(tyslUrl,param1);*/
        //发送http请求并获取受理返回通信xml报文
        String result = null;
        try{
            result = HttpUtil.sendPostRequest(tyslUrl,tcmXml);
        }catch (Exception e){
            return hyxtReturnError("0006","连接统一受理平台失败！");
        }
        if(StringUtils.isEmpty(result)){
            return hyxtReturnError("0004","没有获取受理返回的通信报文");
        }
        logger.info("获取受理返回通信xml：" + result);

        //将通信报文转成java对象
        OutputTripPackage outputTripPackage = null;
        try {
            outputTripPackage = XmlUtil.convertToJavaBean(result,OutputTripPackage.class);
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        //解析业务密文
        String businessContent = Base64Encoder.decodeString(outputTripPackage.getBusinessContent());
        logger.info("解密返回业务报文：" + businessContent);

        //将业务报文转换成java对象
        CxslOutputBusiness cxslOutputBusiness = null;
        try {
            cxslOutputBusiness = XmlUtil.convertToJavaBean(businessContent,CxslOutputBusiness.class);
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        //将body层xml转换成json返回给前端
        CxslOutputBody cxslOutputBody = null;
        cxslOutputBody = cxslOutputBusiness.getBody();
        String outJson = JSONObject.toJSONString(cxslOutputBody);
        return outJson;
    }


    //返回错误信息json串
    private String fwskReturnError(String code,String mess){
        ErrorMsg fwskErrorMsg = new ErrorMsg();
        fwskErrorMsg.setCode(code);
        fwskErrorMsg.setMess(mess);
        String errorJson = JSONObject.toJSONString(fwskErrorMsg);
        return errorJson;

    }

    //货运返回错误信息json串
    private String hyxtReturnError(String returnCode ,String returnMessage){
        ErrorMsg hyxtErrorMsg = new ErrorMsg();
        hyxtErrorMsg.setReturnCode(returnCode);
        hyxtErrorMsg.setReturnMessage(returnMessage);
        String errorJson = JSONObject.toJSONString(hyxtErrorMsg);
        return errorJson;
    }
    //总返回错误信息json串
    private String allReturnError(String code,String mess,String returnCode,String returnMessage){
        ErrorMsg errorMsg = new ErrorMsg();
        errorMsg.setCode(code);
        errorMsg.setMess(mess);
        errorMsg.setReturnCode(returnCode);
        errorMsg.setReturnMessage(returnMessage);
        String errorJson = JSONObject.toJSONString(errorMsg);
        return errorJson;
    }

}
