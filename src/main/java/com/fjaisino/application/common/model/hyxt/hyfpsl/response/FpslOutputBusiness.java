package com.fjaisino.application.common.model.hyxt.hyfpsl.response;


import javax.xml.bind.annotation.*;

/**
 * @program: application
 * @description:
 * @author: Mr.Peng
 * @create: 2018-12-12 17:07
 **/

@XmlRootElement(name = "business")
@XmlAccessorType(XmlAccessType.FIELD)
public class FpslOutputBusiness {

    @XmlAttribute()
    private String id;

    @XmlAttribute()
    private String comment;

    @XmlElement(name = "body")
    private FpslOutputBody body;

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

    public FpslOutputBody getBody() {
        return body;
    }

    public void setBody(FpslOutputBody body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "FpslOutputBusiness{" +
                "id='" + id + '\'' +
                ", comment='" + comment + '\'' +
                ", body=" + body +
                '}';
    }
}
