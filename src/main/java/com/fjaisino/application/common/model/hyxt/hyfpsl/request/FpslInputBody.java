package com.fjaisino.application.common.model.hyxt.hyfpsl.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * @program: application
 * @description:
 * @author: Mr.Peng
 * @create: 2018-12-11 15:27
 **/

@XmlRootElement(name = "body")
@XmlAccessorType(XmlAccessType.FIELD)
public class FpslInputBody {

    @XmlElement(name = "nsrsbh")
    private String nsrsbh;

    @XmlElement(name = "ph")
    private String ph;

    @XmlElement(name = "fplx_dm")
    private String fplx_dm;

    @XmlElement(name = "slsl")
    private String slsl;

    @XmlElement(name = "slsj")
    private String slsj;

    @XmlElement(name = "fpzl_dm")
    private String fpzl_dm;

    @XmlElement(name = "zjlx")
    private String zjlx;

    @XmlElement(name = "zjhm")
    private String zjhm;

    @XmlElement(name = "jbrxm")
    private String jbrxm;

    @XmlElement(name = "slsm")
    private String slsm;

    @XmlElement(name = "lpfs")
    private String lpfs;

    @XmlElement(name = "psxx")
    private List<FpslInputPsxx> psxxes;

    public String getNsrsbh() {
        return nsrsbh;
    }

    public void setNsrsbh(String nsrsbh) {
        this.nsrsbh = nsrsbh;
    }

    public String getPh() {
        return ph;
    }

    public void setPh(String ph) {
        this.ph = ph;
    }

    public String getFplx_dm() {
        return fplx_dm;
    }

    public void setFplx_dm(String fplx_dm) {
        this.fplx_dm = fplx_dm;
    }

    public String getSlsl() {
        return slsl;
    }

    public void setSlsl(String slsl) {
        this.slsl = slsl;
    }

    public String getSlsj() {
        return slsj;
    }

    public void setSlsj(String slsj) {
        this.slsj = slsj;
    }

    public String getFpzl_dm() {
        return fpzl_dm;
    }

    public void setFpzl_dm(String fpzl_dm) {
        this.fpzl_dm = fpzl_dm;
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

    public String getSlsm() {
        return slsm;
    }

    public void setSlsm(String slsm) {
        this.slsm = slsm;
    }

    public String getLpfs() {
        return lpfs;
    }

    public void setLpfs(String lpfs) {
        this.lpfs = lpfs;
    }

    public List<FpslInputPsxx> getPsxxes() {
        return psxxes;
    }

    public void setPsxxes(List<FpslInputPsxx> psxxes) {
        this.psxxes = psxxes;
    }

    @Override
    public String toString() {
        return "FpslInputBody{" +
                "nsrsbh='" + nsrsbh + '\'' +
                ", ph='" + ph + '\'' +
                ", fplx_dm='" + fplx_dm + '\'' +
                ", slsl='" + slsl + '\'' +
                ", slsj='" + slsj + '\'' +
                ", fpzl_dm='" + fpzl_dm + '\'' +
                ", zjlx='" + zjlx + '\'' +
                ", zjhm='" + zjhm + '\'' +
                ", jbrxm='" + jbrxm + '\'' +
                ", slsm='" + slsm + '\'' +
                ", lpfs='" + lpfs + '\'' +
                ", psxxes=" + psxxes +
                '}';
    }
}






























































