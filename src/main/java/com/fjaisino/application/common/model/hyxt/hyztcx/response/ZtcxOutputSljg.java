package com.fjaisino.application.common.model.hyxt.hyztcx.response;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * @program: application
 * @description:
 * @author: Mr.Peng
 * @create: 2018-12-11 21:20
 **/
@XmlRootElement(name = "sljg")
@XmlAccessorType(XmlAccessType.FIELD)
public class ZtcxOutputSljg {

    @XmlAttribute()
    private String xh;

    @XmlElement(name = "fplx_dm")
    private String fplx_dm;

    @XmlElement(name = "fpzl_dm")
    private String fpzl_dm;

    @XmlElement(name = "slxh")
    private String slxh;

    @XmlElement(name = "slsl")
    private String slsl;

    @XmlElement(name = "slsj")
    private String slsj;

    @XmlElement(name = "clzt")
    private String clzt;

    @XmlElement(name = "clxx")
    private String clxx;

    @XmlElement(name = "clsj")
    private String clsj;

    @XmlElement(name = "ysqbh")
    private String ysqbh;

    @XmlElement(name = "qrjg")
    private String qrjg;

    @XmlElement(name = "sljgmx")
    private ZtcxOutputSljgmx sljgmx;

    public List<String> getKddhs() {
        return kddhs;
    }

    public void setKddhs(List<String> kddhs) {
        this.kddhs = kddhs;
    }

    @XmlElement(name = "kddhs")
    private List<String> kddhs;

    public String getXh() {
        return xh;
    }

    public void setXh(String xh) {
        this.xh = xh;
    }

    public String getFplx_dm() {
        return fplx_dm;
    }

    public void setFplx_dm(String fplx_dm) {
        this.fplx_dm = fplx_dm;
    }

    public String getFpzl_dm() {
        return fpzl_dm;
    }

    public void setFpzl_dm(String fpzl_dm) {
        this.fpzl_dm = fpzl_dm;
    }

    public String getSlxh() {
        return slxh;
    }

    public void setSlxh(String slxh) {
        this.slxh = slxh;
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

    public String getClzt() {
        return clzt;
    }

    public void setClzt(String clzt) {
        this.clzt = clzt;
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

    public String getYsqbh() {
        return ysqbh;
    }

    public void setYsqbh(String ysqbh) {
        this.ysqbh = ysqbh;
    }

    public String getQrjg() {
        return qrjg;
    }

    public void setQrjg(String qrjg) {
        this.qrjg = qrjg;
    }

    public ZtcxOutputSljgmx getSljgmx() {
        return sljgmx;
    }

    public void setSljgmx(ZtcxOutputSljgmx sljgmx) {
        this.sljgmx = sljgmx;
    }

    @Override
    public String toString() {
        return "ZtcxOutputSljg{" +
                "xh='" + xh + '\'' +
                ", fplx_dm='" + fplx_dm + '\'' +
                ", fpzl_dm='" + fpzl_dm + '\'' +
                ", slxh='" + slxh + '\'' +
                ", slsl='" + slsl + '\'' +
                ", slsj='" + slsj + '\'' +
                ", clzt='" + clzt + '\'' +
                ", clxx='" + clxx + '\'' +
                ", clsj='" + clsj + '\'' +
                ", ysqbh='" + ysqbh + '\'' +
                ", qrjg='" + qrjg + '\'' +
                ", sljgmx=" + sljgmx +
                ", kddhs" + kddhs +
                '}';
    }
}
