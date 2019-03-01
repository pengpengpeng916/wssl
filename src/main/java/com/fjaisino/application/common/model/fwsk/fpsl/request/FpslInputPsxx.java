package com.fjaisino.application.common.model.fwsk.fpsl.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * @program: application
 * @description:
 * @author: Mr.Peng
 * @create: 2018-12-11 17:52
 **/
@XmlRootElement(name = "PSXX")
@XmlAccessorType(XmlAccessType.FIELD)
public class FpslInputPsxx {

    @XmlElement(name = "SJRXX")
    private List<FpslInputSjrxx> sjrxxes;

    public List<FpslInputSjrxx> getSjrxxes() {
        return sjrxxes;
    }

    public void setSjrxxes(List<FpslInputSjrxx> sjrxxes) {
        this.sjrxxes = sjrxxes;
    }

    @Override
    public String toString() {
        return "FpslInputPsxx{" +
                "sjrxxes=" + sjrxxes +
                '}';
    }
}
