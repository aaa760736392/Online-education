package com.first.boot.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "user_comment")
public class UserComment implements Serializable {
    /**
     * 用户自增ID
     */
    @Id
    @Column(name = "user_comment_id")
    private Integer userCommentId;

    /**
     * 用户ID
     */
    @Column(name = "user_comment_login_id")
    private Integer userCommentLoginId;

    /**
     * 课程表ID
     */
    @Column(name = "user_comment_total_id")
    private Integer userCommentTotalId;

    @Column(name = "user_comment_content")
    private String userCommentContent;

    /**
     * 评论时间
     */
    @Column(name = "user_comment_time")
    private Date userCommentTime;

    private static final long serialVersionUID = 1L;

    /**
     * 获取用户自增ID
     *
     * @return user_comment_id - 用户自增ID
     */
    public Integer getUserCommentId() {
        return userCommentId;
    }

    /**
     * 设置用户自增ID
     *
     * @param userCommentId 用户自增ID
     */
    public void setUserCommentId(Integer userCommentId) {
        this.userCommentId = userCommentId;
    }

    /**
     * 获取用户ID
     *
     * @return user_comment_login_id - 用户ID
     */
    public Integer getUserCommentLoginId() {
        return userCommentLoginId;
    }

    /**
     * 设置用户ID
     *
     * @param userCommentLoginId 用户ID
     */
    public void setUserCommentLoginId(Integer userCommentLoginId) {
        this.userCommentLoginId = userCommentLoginId;
    }

    /**
     * 获取课程表ID
     *
     * @return user_comment_total_id - 课程表ID
     */
    public Integer getUserCommentTotalId() {
        return userCommentTotalId;
    }

    /**
     * 设置课程表ID
     *
     * @param userCommentTotalId 课程表ID
     */
    public void setUserCommentTotalId(Integer userCommentTotalId) {
        this.userCommentTotalId = userCommentTotalId;
    }

    /**
     * @return user_comment_content
     */
    public String getUserCommentContent() {
        return userCommentContent;
    }

    /**
     * @param userCommentContent
     */
    public void setUserCommentContent(String userCommentContent) {
        this.userCommentContent = userCommentContent;
    }

    /**
     * 获取评论时间
     *
     * @return user_comment_time - 评论时间
     */
    public Date getUserCommentTime() {
        return userCommentTime;
    }

    /**
     * 设置评论时间
     *
     * @param userCommentTime 评论时间
     */
    public void setUserCommentTime(Date userCommentTime) {
        this.userCommentTime = userCommentTime;
    }
}