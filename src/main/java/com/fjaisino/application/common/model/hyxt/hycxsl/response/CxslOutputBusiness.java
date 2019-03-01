package com.fjaisino.application.common.model.hyxt.hycxsl.response;

import javax.xml.bind.annotation.*;

/**
 * @program: application
 * @description:
 * @author: Mr.Peng
 * @create: 2018-12-12 18:29
 **/
@XmlRootElement(name = "business")
@XmlAccessorType(XmlAccessType.FIELD)
public class CxslOutputBusiness {

    @XmlAttribute()
    private String id = "fp_cxsl";

    @XmlAttribute()
    private String comment = "撤销网上申领";

    @XmlElement(name = "body")
    private CxslOutputBody body;

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

    public CxslOutputBody getBody() {
        return body;
    }

    public void setBody(CxslOutputBody body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "CxslOutputBusiness{" +
                "id='" + id + '\'' +
                ", comment='" + comment + '\'' +
                ", body=" + body +
                '}';
    }
}
