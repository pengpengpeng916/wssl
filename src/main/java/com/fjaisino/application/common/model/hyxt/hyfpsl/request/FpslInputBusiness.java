package com.fjaisino.application.common.model.hyxt.hyfpsl.request;

import javax.xml.bind.annotation.*;

/**
 * @program: application
 * @description:
 * @author: Mr.Peng
 * @create: 2018-12-12 16:51
 **/
@XmlRootElement(name = "business")
@XmlAccessorType(XmlAccessType.FIELD)
public class FpslInputBusiness {

    @XmlAttribute()
    private String id = "fp_sl";

    @XmlAttribute()
    private String comment = "发票申领";

    @XmlElement(name = "body")
    private FpslInputBody body;

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

    public FpslInputBody getBody() {
        return body;
    }

    public void setBody(FpslInputBody body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "FpslInputBusiness{" +
                "id='" + id + '\'' +
                ", comment='" + comment + '\'' +
                ", body=" + body +
                '}';
    }
}
