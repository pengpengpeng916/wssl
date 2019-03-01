package com.fjaisino.application.common.model.hyxt.hypzhd.response;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * @program: application
 * @description:
 * @author: Mr.Peng
 * @create: 2018-12-11 22:15
 **/

@XmlRootElement(name = "body")
@XmlAccessorType(XmlAccessType.FIELD)
public class PzhdOutputBody {

    @XmlAttribute()
    private String count;

    @XmlElement(name = "nsrsbh")
    private String nsrsbh;

    @XmlElement(name = "returnCode")
    private String returnCode;

    @XmlElement(name = "returnMessage")
    private String returnMessage;

    @XmlElement(name = "group")
    private List<PzhdOutputGroup> groups;

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getNsrsbh() {
        return nsrsbh;
    }

    public void setNsrsbh(String nsrsbh) {
        this.nsrsbh = nsrsbh;
    }

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public String getReturnMessage() {
        return returnMessage;
    }

    public void setReturnMessage(String returnMessage) {
        this.returnMessage = returnMessage;
    }

    public List<PzhdOutputGroup> getGroups() {
        return groups;
    }

    public void setGroups(List<PzhdOutputGroup> groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "PzhdOutputBody{" +
                "count='" + count + '\'' +
                ", nsrsbh='" + nsrsbh + '\'' +
                ", returnCode='" + returnCode + '\'' +
                ", returnMessage='" + returnMessage + '\'' +
                ", groups=" + groups +
                '}';
    }
}
