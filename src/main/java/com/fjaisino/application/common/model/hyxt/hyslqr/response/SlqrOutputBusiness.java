package com.fjaisino.application.common.model.hyxt.hyslqr.response;


import javax.xml.bind.annotation.*;

/**
 * @program: application
 * @description:
 * @author: Mr.Peng
 * @create: 2018-12-12 18:20
 **/
@XmlRootElement(name = "business")
@XmlAccessorType(XmlAccessType.FIELD)
public class SlqrOutputBusiness {

    @XmlAttribute()
    private String id = "fp_sljg";

    @XmlAttribute()
    private String comment = "发票申领结果";

    @XmlElement(name = "body")
    private SlqrOutputBody body;

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

    public SlqrOutputBody getBody() {
        return body;
    }

    public void setBody(SlqrOutputBody body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "SlqrOutputBusiness{" +
                "id='" + id + '\'' +
                ", comment='" + comment + '\'' +
                ", body=" + body +
                '}';
    }
}
