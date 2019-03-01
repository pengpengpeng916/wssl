package com.fjaisino.application.common.model.hyxt.hypzhd.response;

import javax.xml.bind.annotation.*;

/**
 * @program: application
 * @description:
 * @author: Mr.Peng
 * @create: 2018-12-11 22:15
 **/
@XmlRootElement(name = "group")
@XmlAccessorType(XmlAccessType.FIELD)
public class PzhdOutputGroup {

    @XmlAttribute()
    private String xh;

    @XmlElement(name = "fpzl_dm")
    private String fpzl_dm;

    @XmlElement(name = "fpzl_mc")
    private String fpzl_mc;

    @XmlElement(name = "fplx_dm")
    private String fplx_dm;

    @XmlElement(name = "mcfpxe")
    private String mcfpxe;

    @XmlElement(name = "myfpxe")
    private String myfpxe;

    @XmlElement(name = "zgcpl")
    private String zgcpl;

    public String getXh() {
        return xh;
    }

    public void setXh(String xh) {
        this.xh = xh;
    }

    public String getFpzl_dm() {
        return fpzl_dm;
    }

    public void setFpzl_dm(String fpzl_dm) {
        this.fpzl_dm = fpzl_dm;
    }

    public String getFpzl_mc() {
        return fpzl_mc;
    }

    public void setFpzl_mc(String fpzl_mc) {
        this.fpzl_mc = fpzl_mc;
    }

    public String getFplx_dm() {
        return fplx_dm;
    }

    public void setFplx_dm(String fplx_dm) {
        this.fplx_dm = fplx_dm;
    }

    public String getMcfpxe() {
        return mcfpxe;
    }

    public void setMcfpxe(String mcfpxe) {
        this.mcfpxe = mcfpxe;
    }

    public String getMyfpxe() {
        return myfpxe;
    }

    public void setMyfpxe(String myfpxe) {
        this.myfpxe = myfpxe;
    }

    public String getZgcpl() {
        return zgcpl;
    }

    public void setZgcpl(String zgcpl) {
        this.zgcpl = zgcpl;
    }

    @Override
    public String toString() {
        return "PzhdOutputGroup{" +
                "xh='" + xh + '\'' +
                ", fpzl_dm='" + fpzl_dm + '\'' +
                ", fpzl_mc='" + fpzl_mc + '\'' +
                ", fplx_dm='" + fplx_dm + '\'' +
                ", mcfpxe='" + mcfpxe + '\'' +
                ", myfpxe='" + myfpxe + '\'' +
                ", zgcpl='" + zgcpl + '\'' +
                '}';
    }
}





