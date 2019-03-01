package com.fjaisino.application.common.model.fwsk.pzhd.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * @program: application
 * @description:
 * @author: Mr.Peng
 * @create: 2018-12-11 22:01
 **/

@XmlRootElement(name = "DATA")
@XmlAccessorType(XmlAccessType.FIELD)
public class PzhdOutputData {

    @XmlElement(name = "NSRSBH")
    private String nsrsbh;

    @XmlElement(name = "KPJH")
    private String kpjh;

    @XmlElement(name = "SBBH")
    private String sbbh;

    @XmlElement(name = "PZHDXX")
    private List<PzhdOutputPzhdxx> pzhdxxes;

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

    public List<PzhdOutputPzhdxx> getPzhdxxes() {
        return pzhdxxes;
    }

    public void setPzhdxxes(List<PzhdOutputPzhdxx> pzhdxxes) {
        this.pzhdxxes = pzhdxxes;
    }

    @Override
    public String toString() {
        return "FpslOutputData{" +
                "nsrsbh='" + nsrsbh + '\'' +
                ", kpjh='" + kpjh + '\'' +
                ", sbbh='" + sbbh + '\'' +
                ", pzhdxxes=" + pzhdxxes +
                '}';
    }
}
