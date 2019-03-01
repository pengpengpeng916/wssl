package com.fjaisino.application.common.model.hyxt.hypzhd.request;


import javax.xml.bind.annotation.*;

/**
 * @program: application
 * @description:
 * @author: Mr.Peng
 * @create: 2018-12-12 17:51
 **/

@XmlRootElement(name = "business")
@XmlAccessorType(XmlAccessType.FIELD)
public class PzhdInputBusiness {

    @XmlAttribute()
    private String id = "fp_zltb";

    @XmlAttribute()
    private String comment = "发票种类同步";

    @XmlElement(name = "body")
    private PzhdInputBody body;

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

    public PzhdInputBody getBody() {
        return body;
    }

    public void setBody(PzhdInputBody body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "PzhdInputBusiness{" +
                "id='" + id + '\'' +
                ", comment='" + comment + '\'' +
                ", body=" + body +
                '}';
    }
}
