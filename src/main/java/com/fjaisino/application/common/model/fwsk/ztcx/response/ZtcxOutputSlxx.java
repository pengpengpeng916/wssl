package com.fjaisino.application.common.model.fwsk.ztcx.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * @program: application
 * @description:
 * @author: Mr.Peng
 * @create: 2018-12-11 20:44
 **/
@XmlRootElement(name = "SLXX")
@XmlAccessorType(XmlAccessType.FIELD)
public class ZtcxOutputSlxx {

    @XmlElement(name = "FPZL")
    private String fpzl;

    @XmlElement(name = "FPZLDM")
    private String fpzldm;

    @XmlElement(name = "FPZLMC")
    private String fpzlmc;

    @XmlElement(name = "SLSL")
    private String slsl;

    @XmlElement(name = "SQSJ")
    private String sqsj;

    @XmlElement(name = "SLXH")
    private String slxh;

    @XmlElement(name = "SLZT")
    private String slzt;

    @XmlElement(name = "CLXX")
    private String clxx;

    @XmlElement(name = "CLSJ")
    private String clsj;

    @XmlElement(name = "SLQRBZ")
    private String slqrbz;

    @XmlElement(name = "YSQBH")
    private String ysqbh;

    @XmlElement(name = "JGQRBZ")
    private String jgqrbz;

    @XmlElement(name = "FPJXX")
    private List<ZtcxOutputFpjxx> fpjxxes;

    private List<String> kddhs;

    public String getFpzl() {
        return fpzl;
    }

    public void setFpzl(String fpzl) {
        this.fpzl = fpzl;
    }

    public String getFpzldm() {
        return fpzldm;
    }

    public void setFpzldm(String fpzldm) {
        this.fpzldm = fpzldm;
    }

    public String getFpzlmc() {
        return fpzlmc;
    }

    public void setFpzlmc(String fpzlmc) {
        this.fpzlmc = fpzlmc;
    }

    public String getSlsl() {
        return slsl;
    }

    public void setSlsl(String slsl) {
        this.slsl = slsl;
    }

    public String getSqsj() {
        return sqsj;
    }

    public void setSqsj(String sqsj) {
        this.sqsj = sqsj;
    }

    public String getSlxh() {
        return slxh;
    }

    public void setSlxh(String slxh) {
        this.slxh = slxh;
    }

    public String getSlzt() {
        return slzt;
    }

    public void setSlzt(String slzt) {
        this.slzt = slzt;
    }

    public String getClxx() {
        return clxx;
    }

    public void setClxx(String clxx) {
        this.clxx = clxx;
    }

    public String getClsj() {
        return clsj;
    }

    public void setClsj(String clsj) {
        this.clsj = clsj;
    }

    public String getSlqrbz() {
        return slqrbz;
    }

    public void setSlqrbz(String slqrbz) {
        this.slqrbz = slqrbz;
    }

    public String getYsqbh() {
        return ysqbh;
    }

    public void setYsqbh(String ysqbh) {
        this.ysqbh = ysqbh;
    }

    public String getJgqrbz() {
        return jgqrbz;
    }

    public void setJgqrbz(String jgqrbz) {
        this.jgqrbz = jgqrbz;
    }

    public List<ZtcxOutputFpjxx> getFpjxxes() {
        return fpjxxes;
    }

    public void setFpjxxes(List<ZtcxOutputFpjxx> fpjxxes) {
        this.fpjxxes = fpjxxes;
    }

    public List<String> getKddhs() {
        return kddhs;
    }

    public void setKddhs(List<String> kddhs) {
        this.kddhs = kddhs;
    }

    @Override
    public String toString() {
        return "ZtcxOutputSlxx{" +
                "fpzl='" + fpzl + '\'' +
                ", fpzldm='" + fpzldm + '\'' +
                ", fpzlmc='" + fpzlmc + '\'' +
                ", slsl='" + slsl + '\'' +
                ", sqsj='" + sqsj + '\'' +
                ", slxh='" + slxh + '\'' +
                ", slzt='" + slzt + '\'' +
                ", clxx='" + clxx + '\'' +
                ", clsj='" + clsj + '\'' +
                ", slqrbz='" + slqrbz + '\'' +
                ", ysqbh='" + ysqbh + '\'' +
                ", jgqrbz='" + jgqrbz + '\'' +
                ", fpjxxes=" + fpjxxes +
                ", kddhs=" + kddhs +
                '}';
    }
}
