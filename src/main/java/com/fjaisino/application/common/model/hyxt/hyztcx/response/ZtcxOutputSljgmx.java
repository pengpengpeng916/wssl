package com.fjaisino.application.common.model.hyxt.hyztcx.response;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * @program: application
 * @description:
 * @author: Mr.Peng
 * @create: 2018-12-11 21:21
 **/

@XmlRootElement(name = "sljgmx")
@XmlAccessorType(XmlAccessType.FIELD)
public class ZtcxOutputSljgmx {

    @XmlAttribute()
    private String count;

    @XmlElement(name = "sljg_mx")
    private List<ZtcxOutputSljgmxXh> sljgmxXhs;

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public List<ZtcxOutputSljgmxXh> getSljgmxXhs() {
        return sljgmxXhs;
    }

    public void setSljgmxXhs(List<ZtcxOutputSljgmxXh> sljgmxXhs) {
        this.sljgmxXhs = sljgmxXhs;
    }


    @Override
    public String toString() {
        return "ZtcxOutputSljgmx{" +
                "count='" + count + '\'' +
                ", sljgmxXhs=" + sljgmxXhs +
                '}';
    }
}
