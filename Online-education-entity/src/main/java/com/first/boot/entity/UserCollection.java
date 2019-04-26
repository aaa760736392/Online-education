package com.first.boot.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "user_collection")
public class UserCollection implements Serializable {
    /**
     * 收藏ID
     */
    @Id
    @Column(name = "user_Collection_id")
    private Integer userCollectionId;

    /**
     * 用户ID
     */
    @Column(name = "user_Collection_login_id")
    private Integer userCollectionLoginId;

    /**
     * 课程总表ID
     */
    @Column(name = "user_Collection_curriculum_id")
    private Integer userCollectionCurriculumId;

    private static final long serialVersionUID = 1L;

    /**
     * 获取收藏ID
     *
     * @return user_Collection_id - 收藏ID
     */
    public Integer getUserCollectionId() {
        return userCollectionId;
    }

    /**
     * 设置收藏ID
     *
     * @param userCollectionId 收藏ID
     */
    public void setUserCollectionId(Integer userCollectionId) {
        this.userCollectionId = userCollectionId;
    }

    /**
     * 获取用户ID
     *
     * @return user_Collection_login_id - 用户ID
     */
    public Integer getUserCollectionLoginId() {
        return userCollectionLoginId;
    }

    /**
     * 设置用户ID
     *
     * @param userCollectionLoginId 用户ID
     */
    public void setUserCollectionLoginId(Integer userCollectionLoginId) {
        this.userCollectionLoginId = userCollectionLoginId;
    }

    /**
     * 获取课程总表ID
     *
     * @return user_Collection_curriculum_id - 课程总表ID
     */
    public Integer getUserCollectionCurriculumId() {
        return userCollectionCurriculumId;
    }

    /**
     * 设置课程总表ID
     *
     * @param userCollectionCurriculumId 课程总表ID
     */
    public void setUserCollectionCurriculumId(Integer userCollectionCurriculumId) {
        this.userCollectionCurriculumId = userCollectionCurriculumId;
    }
}