package com.fjaisino.application.common.model.hyxt.hyztcx.request;


import javax.xml.bind.annotation.*;

/**
 * @program: application
 * @description:
 * @author: Mr.Peng
 * @create: 2018-12-12 17:12
 **/

@XmlRootElement(name = "business")
@XmlAccessorType(XmlAccessType.FIELD)
public class ZtcxInputBusiness {

    @XmlAttribute()
    private String id = "fp_sljg";

    @XmlAttribute()
    private String comment = "发票申领结果";

    @XmlElement(name = "body")
    private ZtcxInputBody body;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public ZtcxInputBody getBody() {
        return body;
    }

    public void setBody(ZtcxInputBody body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "ZtcxInputBusiness{" +
                "id='" + id + '\'' +
                ", comment='" + comment + '\'' +
                ", body=" + body +
                '}';
    }
}
