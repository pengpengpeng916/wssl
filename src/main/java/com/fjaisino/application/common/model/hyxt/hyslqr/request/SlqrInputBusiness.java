package com.fjaisino.application.common.model.hyxt.hyslqr.request;

import javax.xml.bind.annotation.*;

/**
 * @program: application
 * @description:
 * @author: Mr.Peng
 * @create: 2018-12-12 18:14
 **/
@XmlRootElement(name = "business")
@XmlAccessorType(XmlAccessType.FIELD)
public class SlqrInputBusiness {

    @XmlAttribute()
    private String id = "fp_jsqr";

    @XmlAttribute()
    private String comment = "纸质票接收确认";

    @XmlElement(name = "body")
    private SlqrInputBody body;

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

    public SlqrInputBody getBody() {
        return body;
    }

    public void setBody(SlqrInputBody body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "SlqrInputBusiness{" +
                "id='" + id + '\'' +
                ", comment='" + comment + '\'' +
                ", body=" + body +
                '}';
    }
}


