package com.fjaisino.application.common.model.outmessage.outzzsfpxt.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @program: application
 * @description:
 * @author: Mr.Peng
 * @create: 2018-12-12 20:58
 **/
@XmlRootElement(name = "INPUT")
@XmlAccessorType(XmlAccessType.FIELD)
public class OuterInputInput {

    @XmlElement(name = "CLIENT_TYPE")
    private String clientType;

    @XmlElement(name = "CLIENT_VER")
    private String clientVer;

    @XmlElement(name = "BOTTOM_VER")
    private String bottomVer;

    @XmlElement(name = "BMB_VER")
    private String bmbVer;

    @XmlElement(name = "ZBXLH")
    private String zbxlh;

    @XmlElement(name = "KPRJ_VER")
    private String kprjVer;

    @XmlElement(name = "IP")
    private String ip;

    @XmlElement(name = "MAC")
    private String mac;

    @XmlElement(name = "YDK")
    private String ydk;

    @XmlElement(name = "BDBZ")
    private String bdbz;

    @XmlElement(name = "NSRSBH")
    private String nsrsbh;

    @XmlElement(name = "KPJH")
    private String kpjh;

    @XmlElement(name = "SBBH")
    private String sbbh;

    @XmlElement(name = "YSBZ")
    private String ysbz;

    @XmlElement(name = "DATA")
    private String data;

    @XmlElement(name = "CRC")
    private String crc;

    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    public String getClientVer() {
        return clientVer;
    }

    public void setClientVer(String clientVer) {
        this.clientVer = clientVer;
    }

    public String getBottomVer() {
        return bottomVer;
    }

    public void setBottomVer(String bottomVer) {
        this.bottomVer = bottomVer;
    }

    public String getBmbVer() {
        return bmbVer;
    }

    public void setBmbVer(String bmbVer) {
        this.bmbVer = bmbVer;
    }

    public String getZbxlh() {
        return zbxlh;
    }

    public void setZbxlh(String zbxlh) {
        this.zbxlh = zbxlh;
    }

    public String getKprjVer() {
        return kprjVer;
    }

    public void setKprjVer(String kprjVer) {
        this.kprjVer = kprjVer;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getYdk() {
        return ydk;
    }

    public void setYdk(String ydk) {
        this.ydk = ydk;
    }

    public String getBdbz() {
        return bdbz;
    }

    public void setBdbz(String bdbz) {
        this.bdbz = bdbz;
    }

    public String getNsrsbh() {
        return nsrsbh;
    }

    public void setNsrsbh(String nsrsbh) {
        this.nsrsbh = nsrsbh;
    }

    public String getKpjh() {
        return kpjh;
    }

    public void setKpjh(String kpjh) {
        this.kpjh = kpjh;
    }

    public String getSbbh() {
        return sbbh;
    }

    public void setSbbh(String sbbh) {
        this.sbbh = sbbh;
    }

    public String getYsbz() {
        return ysbz;
    }

    public void setYsbz(String ysbz) {
        this.ysbz = ysbz;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getCrc() {
        return crc;
    }

    public void setCrc(String crc) {
        this.crc = crc;
    }

    @Override
    public String toString() {
        return "OuterInputInput{" +
                "clientType='" + clientType + '\'' +
                ", clientVer='" + clientVer + '\'' +
                ", bottomVer='" + bottomVer + '\'' +
                ", bmbVer='" + bmbVer + '\'' +
                ", zbxlh='" + zbxlh + '\'' +
                ", kprjVer='" + kprjVer + '\'' +
                ", ip='" + ip + '\'' +
                ", mac='" + mac + '\'' +
                ", ydk='" + ydk + '\'' +
                ", bdbz='" + bdbz + '\'' +
                ", nsrsbh='" + nsrsbh + '\'' +
                ", kpjh='" + kpjh + '\'' +
                ", sbbh='" + sbbh + '\'' +
                ", ysbz='" + ysbz + '\'' +
                ", data='" + data + '\'' +
                ", crc='" + crc + '\'' +
                '}';
    }
}
