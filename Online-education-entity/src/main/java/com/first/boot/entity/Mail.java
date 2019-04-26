package com.first.boot.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "mail")
public class Mail implements Serializable {
    /**
     * 自增ID
     */
    @Id
    @Column(name = "mail_id")
    private Integer mailId;

    /**
     * 发送人员ID
     */
    @Column(name = "mail_send_user_id")
    private Integer mailSendUserId;

    /**
     * 接收人员ID
     */
    @Column(name = "mail_Receive_user_id")
    private Integer mailReceiveUserId;

    /**
     * 内容
     */
    @Column(name = "mail_content")
    private String mailContent;

    /**
     * 标题
     */
    @Column(name = "mail_title")
    private String mailTitle;

    /**
     * 发送时间
     */
    @Column(name = "mail_time")
    private Date mailTime;

    /**
     * 信件类型
     */
    @Column(name = "mail_type_id")
    private Integer mailTypeId;

    private static final long serialVersionUID = 1L;

    /**
     * 获取自增ID
     *
     * @return mail_id - 自增ID
     */
    public Integer getMailId() {
        return mailId;
    }

    /**
     * 设置自增ID
     *
     * @param mailId 自增ID
     */
    public void setMailId(Integer mailId) {
        this.mailId = mailId;
    }

    /**
     * 获取发送人员ID
     *
     * @return mail_send_user_id - 发送人员ID
     */
    public Integer getMailSendUserId() {
        return mailSendUserId;
    }

    /**
     * 设置发送人员ID
     *
     * @param mailSendUserId 发送人员ID
     */
    public void setMailSendUserId(Integer mailSendUserId) {
        this.mailSendUserId = mailSendUserId;
    }

    /**
     * 获取接收人员ID
     *
     * @return mail_Receive_user_id - 接收人员ID
     */
    public Integer getMailReceiveUserId() {
        return mailReceiveUserId;
    }

    /**
     * 设置接收人员ID
     *
     * @param mailReceiveUserId 接收人员ID
     */
    public void setMailReceiveUserId(Integer mailReceiveUserId) {
        this.mailReceiveUserId = mailReceiveUserId;
    }

    /**
     * 获取内容
     *
     * @return mail_content - 内容
     */
    public String getMailContent() {
        return mailContent;
    }

    /**
     * 设置内容
     *
     * @param mailContent 内容
     */
    public void setMailContent(String mailContent) {
        this.mailContent = mailContent;
    }

    /**
     * 获取标题
     *
     * @return mail_title - 标题
     */
    public String getMailTitle() {
        return mailTitle;
    }

    /**
     * 设置标题
     *
     * @param mailTitle 标题
     */
    public void setMailTitle(String mailTitle) {
        this.mailTitle = mailTitle;
    }

    /**
     * 获取发送时间
     *
     * @return mail_time - 发送时间
     */
    public Date getMailTime() {
        return mailTime;
    }

    /**
     * 设置发送时间
     *
     * @param mailTime 发送时间
     */
    public void setMailTime(Date mailTime) {
        this.mailTime = mailTime;
    }

    /**
     * 获取信件类型
     *
     * @return mail_type_id - 信件类型
     */
    public Integer getMailTypeId() {
        return mailTypeId;
    }

    /**
     * 设置信件类型
     *
     * @param mailTypeId 信件类型
     */
    public void setMailTypeId(Integer mailTypeId) {
        this.mailTypeId = mailTypeId;
    }
}