package com.fjaisino.application.common.model.outmessage.outzzsfpxt.request;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @program: application
 * @description:
 * @author: Mr.Peng
 * @create: 2018-12-12 20:56
 **/
@XmlRootElement(name = "ZZSFPXT")
@XmlAccessorType(XmlAccessType.FIELD)
public class OuterInputZzsfpxt {

    @XmlElement(name = "SK_TYPE")
    private String sk_type;

    @XmlElement(name = "OP_TYPE")
    private String op_type;

    @XmlElement(name = "INPUT")
    private OuterInputInput input;

    public String getSk_type() {
        return sk_type;
    }

    public void setSk_type(String sk_type) {
        this.sk_type = sk_type;
    }

    public String getOp_type() {
        return op_type;
    }

    public void setOp_type(String op_type) {
        this.op_type = op_type;
    }

    public OuterInputInput getInput() {
        return input;
    }

    public void setInput(OuterInputInput input) {
        this.input = input;
    }

    @Override
    public String toString() {
        return "OuterInputZzsfpxt{" +
                "sk_type='" + sk_type + '\'' +
                ", op_type='" + op_type + '\'' +
                ", input=" + input +
                '}';
    }
}
