package com.fjaisino.application.common.model.fwsk.pzhd.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @program: application
 * @description:
 * @author: Mr.Peng
 * @create: 2018-12-11 22:01
 **/

@XmlRootElement(name = "PZHDXX")
@XmlAccessorType(XmlAccessType.FIELD)
public class PzhdOutputPzhdxx {

    @XmlElement(name = "FPZL")
    private String fpzl;

    @XmlElement(name = "FPZLDM")
    private String fpzldm;

    @XmlElement(name = "FPZLMC")
    private String fpzlmc;

    @XmlElement(name = "MCFPXE")
    private String mcfpxe;

    @XmlElement(name = "MYFPXE")
    private String myfpxe;

    @XmlElement(name = "ZGCPL")
    private String zgcpl;

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
        return "PzhdOutputPzhdxx{" +
                "fpzl='" + fpzl + '\'' +
                ", fpzldm='" + fpzldm + '\'' +
                ", fpzlmc='" + fpzlmc + '\'' +
                ", mcfpxe='" + mcfpxe + '\'' +
                ", myfpxe='" + myfpxe + '\'' +
                ", zgcpl='" + zgcpl + '\'' +
                '}';
    }
}
