package com.fjaisino.application.common.model.hyxt.hyztcx.response;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * @program: application
 * @description:
 * @author: Mr.Peng
 * @create: 2018-12-11 21:20
 **/
@XmlRootElement(name = "slxx")
@XmlAccessorType(XmlAccessType.FIELD)
public class ZtcxOutputtSlxx {

    @XmlAttribute()
    private String count;

    @XmlElement(name = "sljg")
    private List<ZtcxOutputSljg> sljgs;

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public List<ZtcxOutputSljg> getSljgs() {
        return sljgs;
    }

    public void setSljgs(List<ZtcxOutputSljg> sljgs) {
        this.sljgs = sljgs;
    }

    @Override
    public String toString() {
        return "FpslOutputSlxx{" +
                "count='" + count + '\'' +
                ", sljgs=" + sljgs +
                '}';
    }
}
