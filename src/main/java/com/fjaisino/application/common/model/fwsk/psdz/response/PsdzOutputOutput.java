package com.fjaisino.application.common.model.fwsk.psdz.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * @program: application
 * @description:
 * @author: Mr.Peng
 * @create: 2019-03-01 14:13
 **/
@XmlRootElement(name = "OUTPUT")
@XmlAccessorType(XmlAccessType.FIELD)
public class PsdzOutputOutput {

    @XmlElement(name = "CODE")
    private String code;

    @XmlElement(name = "MESS")
    private String mess;

    @XmlElement(name = "sjrxx")
    private List<PsdzOutputSjrxx> sjrxxes;

    @XmlElement(name = "jydz")
    private String jydz;

    @XmlElement(name = "yzbm")
    private String yzbm;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMess() {
        return mess;
    }

    public void setMess(String mess) {
        this.mess = mess;
    }

    public List<PsdzOutputSjrxx> getSjrxxes() {
        return sjrxxes;
    }

    public void setSjrxxes(List<PsdzOutputSjrxx> sjrxxes) {
        this.sjrxxes = sjrxxes;
    }

    public String getJydz() {
        return jydz;
    }

    public void setJydz(String jydz) {
        this.jydz = jydz;
    }

    public String getYzbm() {
        return yzbm;
    }

    public void setYzbm(String yzbm) {
        this.yzbm = yzbm;
    }

    @Override
    public String toString() {
        return "PsdzOutputOutput{" +
                "code='" + code + '\'' +
                ", mess='" + mess + '\'' +
                ", sjrxxes=" + sjrxxes +
                ", jydz='" + jydz + '\'' +
                ", yzbm='" + yzbm + '\'' +
                '}';
    }
}
