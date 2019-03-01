package com.fjaisino.application.common.model.outmessage.technologymsg.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @program: application
 * @description:
 * @author: Mr.Peng
 * @create: 2018-12-13 20:16
 **/
@XmlRootElement(name = "identity")
@XmlAccessorType(XmlAccessType.FIELD)
public class Identity {

    @XmlElement(name = "applicationId")
    private String applicationId;

    @XmlElement(name = "serviceId")
    private String serviceId;

    @XmlElement(name = "nsrsbh")
    private String nsrsbh;

    @XmlElement(name = "senderName")
    private String senderName;

    @XmlElement(name = "sendTime")
    private String sendTime;

    @XmlElement(name = "globalBusinessId")
    private String globalBusinessId;

    @XmlElement(name = "command")
    private String command;

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getNsrsbh() {
        return nsrsbh;
    }

    public void setNsrsbh(String nsrsbh) {
        this.nsrsbh = nsrsbh;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getSendTime() {
        return sendTime;
    }

    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }

    public String getGlobalBusinessId() {
        return globalBusinessId;
    }

    public void setGlobalBusinessId(String globalBusinessId) {
        this.globalBusinessId = globalBusinessId;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    @Override
    public String toString() {
        return "Identity{" +
                "applicationId='" + applicationId + '\'' +
                ", serviceId='" + serviceId + '\'' +
                ", nsrsbh='" + nsrsbh + '\'' +
                ", senderName='" + senderName + '\'' +
                ", sendTime='" + sendTime + '\'' +
                ", globalBusinessId='" + globalBusinessId + '\'' +
                ", command='" + command + '\'' +
                '}';
    }
}


