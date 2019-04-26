package com.first.boot.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "mail_type")
public class MailType implements Serializable {
    /**
     * 短信内容ID
     */
    @Id
    @Column(name = "mail_type_id")
    private Integer mailTypeId;

    /**
     * 短信类型名称
     */
    @Column(name = "mail_type_name")
    private String mailTypeName;

    private static final long serialVersionUID = 1L;

    /**
     * 获取短信内容ID
     *
     * @return mail_type_id - 短信内容ID
     */
    public Integer getMailTypeId() {
        return mailTypeId;
    }

    /**
     * 设置短信内容ID
     *
     * @param mailTypeId 短信内容ID
     */
    public void setMailTypeId(Integer mailTypeId) {
        this.mailTypeId = mailTypeId;
    }

    /**
     * 获取短信类型名称
     *
     * @return mail_type_name - 短信类型名称
     */
    public String getMailTypeName() {
        return mailTypeName;
    }

    /**
     * 设置短信类型名称
     *
     * @param mailTypeName 短信类型名称
     */
    public void setMailTypeName(String mailTypeName) {
        this.mailTypeName = mailTypeName;
    }
}