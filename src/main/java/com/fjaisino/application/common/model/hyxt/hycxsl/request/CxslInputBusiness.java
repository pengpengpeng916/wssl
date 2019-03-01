package com.fjaisino.application.common.model.hyxt.hycxsl.request;


import javax.xml.bind.annotation.*;

/**
 * @program: application
 * @description:
 * @author: Mr.Peng
 * @create: 2018-12-12 18:26
 **/
@XmlRootElement(name = "business")
@XmlAccessorType(XmlAccessType.FIELD)
public class CxslInputBusiness {

    @XmlAttribute()
    private String id = "fp_cxsl";

    @XmlAttribute()
    private String comment = "撤销网上申领";

    @XmlElement(name = "body")
    private CxslInputBody body;

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

    public CxslInputBody getBody() {
        return body;
    }

    public void setBody(CxslInputBody body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "CxslInputBusiness{" +
                "id='" + id + '\'' +
                ", comment='" + comment + '\'' +
                ", body=" + body +
                '}';
    }
}
