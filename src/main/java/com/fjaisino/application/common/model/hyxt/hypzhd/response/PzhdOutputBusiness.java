package com.fjaisino.application.common.model.hyxt.hypzhd.response;

import javax.xml.bind.annotation.*;

/**
 * @program: application
 * @description:
 * @author: Mr.Peng
 * @create: 2018-12-12 17:58
 **/

@XmlRootElement(name = "business")
@XmlAccessorType(XmlAccessType.FIELD)
public class PzhdOutputBusiness {

    @XmlAttribute()
    private String id = "fp_zltb";

    @XmlAttribute()
    private String comment = "发票种类同步";

    @XmlElement(name = "body")
    private PzhdOutputBody body;

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

    public PzhdOutputBody getBody() {
        return body;
    }

    public void setBody(PzhdOutputBody body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "PzhdOutputBusiness{" +
                "id='" + id + '\'' +
                ", comment='" + comment + '\'' +
                ", body=" + body +
                '}';
    }
}
