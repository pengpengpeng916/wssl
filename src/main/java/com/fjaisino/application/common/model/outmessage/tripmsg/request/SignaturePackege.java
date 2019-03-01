package com.fjaisino.application.common.model.outmessage.tripmsg.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @program: application
 * @description:
 * @author: Mr.Peng
 * @create: 2018-12-13 21:07
 **/
@XmlRootElement(name = "signature")
@XmlAccessorType(XmlAccessType.FIELD)
public class SignaturePackege {

    @XmlElement(name = "messageDigest")
    private String messageDigest;

    public String getMessageDigest() {
        return messageDigest;
    }

    public void setMessageDigest(String messageDigest) {
        this.messageDigest = messageDigest;
    }

    @Override
    public String toString() {
        return "SignaturePackege{" +
                "messageDigest='" + messageDigest + '\'' +
                '}';
    }
}
