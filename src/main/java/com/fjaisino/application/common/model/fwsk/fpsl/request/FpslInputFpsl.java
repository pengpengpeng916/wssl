package com.fjaisino.application.common.model.fwsk.fpsl.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @program: application
 * @description:
 * @author: Mr.Peng
 * @create: 2018-12-11 14:47
 **/

@XmlRootElement(name = "FPSL")
@XmlAccessorType(XmlAccessType.FIELD)
public class FpslInputFpsl {

    @XmlElement(name = "FPZL")
    private String fpzl;

    @XmlElement(name = "FPZLDM")
    private String fpzldm;

    @XmlElement(name = "SLSL")
    private String slsl;

    @XmlElement(name = "ZJLX")
    private String zjlx;

    @XmlElement(name = "ZJHM")
    private String zjhm;

    @XmlElement(name = "JBRXM")
    private String jbrxm;

    @XmlElement(name = "SLFS")
    private String slfs;

    @XmlElement(name = "SLSM")
    private String slsm;

    @XmlElement(name = "PSXX")
    private FpslInputPsxx psxx;

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

    public String getSlsl() {
        return slsl;
    }

    public void setSlsl(String slsl) {
        this.slsl = slsl;
    }

    public String getZjlx() {
        return zjlx;
    }

    public void setZjlx(String zjlx) {
        this.zjlx = zjlx;
    }

    public String getZjhm() {
        return zjhm;
    }

    public void setZjhm(String zjhm) {
        this.zjhm = zjhm;
    }

    public String getJbrxm() {
        return jbrxm;
    }

    public void setJbrxm(String jbrxm) {
        this.jbrxm = jbrxm;
    }

    public String getSlfs() {
        return slfs;
    }

    public void setSlfs(String slfs) {
        this.slfs = slfs;
    }

    public String getSlsm() {
        return slsm;
    }

    public void setSlsm(String slsm) {
        this.slsm = slsm;
    }

    public FpslInputPsxx getPsxx() {
        return psxx;
    }

    public void setPsxx(FpslInputPsxx psxx) {
        this.psxx = psxx;
    }

    @Override
    public String toString() {
        return "FpslInputFpsl{" +
                "fpzl='" + fpzl + '\'' +
                ", fpzldm='" + fpzldm + '\'' +
                ", slsl='" + slsl + '\'' +
                ", zjlx='" + zjlx + '\'' +
                ", zjhm='" + zjhm + '\'' +
                ", jbrxm='" + jbrxm + '\'' +
                ", slfs='" + slfs + '\'' +
                ", slsm='" + slsm + '\'' +
                ", psxx=" + psxx +
                '}';
    }
}
















