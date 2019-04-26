package com.first.boot.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "user_course")
public class UserCourse implements Serializable {
    /**
     * 用户个人课程自增ID
     */
    @Id
    @Column(name = "user_Course_id")
    private Integer userCourseId;

    /**
     * 学员ID
     */
    @Column(name = "user_Course_Login_id")
    private Integer userCourseLoginId;

    /**
     * 课程总ID
     */
    @Column(name = "user_Course_Currculum_id")
    private Integer userCourseCurrculumId;

    /**
     * 记录课程详细表ID
     */
    @Column(name = "user_Course_Learninge_id")
    private Integer userCourseLearningeId;

    private static final long serialVersionUID = 1L;

    /**
     * 获取用户个人课程自增ID
     *
     * @return user_Course_id - 用户个人课程自增ID
     */
    public Integer getUserCourseId() {
        return userCourseId;
    }

    /**
     * 设置用户个人课程自增ID
     *
     * @param userCourseId 用户个人课程自增ID
     */
    public void setUserCourseId(Integer userCourseId) {
        this.userCourseId = userCourseId;
    }

    /**
     * 获取学员ID
     *
     * @return user_Course_Login_id - 学员ID
     */
    public Integer getUserCourseLoginId() {
        return userCourseLoginId;
    }

    /**
     * 设置学员ID
     *
     * @param userCourseLoginId 学员ID
     */
    public void setUserCourseLoginId(Integer userCourseLoginId) {
        this.userCourseLoginId = userCourseLoginId;
    }

    /**
     * 获取课程总ID
     *
     * @return user_Course_Currculum_id - 课程总ID
     */
    public Integer getUserCourseCurrculumId() {
        return userCourseCurrculumId;
    }

    /**
     * 设置课程总ID
     *
     * @param userCourseCurrculumId 课程总ID
     */
    public void setUserCourseCurrculumId(Integer userCourseCurrculumId) {
        this.userCourseCurrculumId = userCourseCurrculumId;
    }

    /**
     * 获取记录课程详细表ID
     *
     * @return user_Course_Learninge_id - 记录课程详细表ID
     */
    public Integer getUserCourseLearningeId() {
        return userCourseLearningeId;
    }

    /**
     * 设置记录课程详细表ID
     *
     * @param userCourseLearningeId 记录课程详细表ID
     */
    public void setUserCourseLearningeId(Integer userCourseLearningeId) {
        this.userCourseLearningeId = userCourseLearningeId;
    }
}