package com.first.entity.pojo;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "teacher")
public class Teacher implements Serializable {
    /**
     * 教师表自增ID
     */
    @Id
    @Column(name = "teacher_id")
    private Integer teacherId;

    /**
     * 教师证明名称
     */
    @Column(name = "teacher_name")
    private String teacherName;

    /**
     * 教师证明图片地址
     */
    @Column(name = "teacher_img")
    private String teacherImg;

    /**
     * 教师资格标识默认为0
     */
    @Column(name = "teacher_mark")
    private Integer teacherMark;

    /**
     * 链接用户id
     */
    @Column(name = "teacher_user_id")
    private Integer teacherUserId;

    private static final long serialVersionUID = 1L;

    /**
     * 获取教师表自增ID
     *
     * @return teacher_id - 教师表自增ID
     */
    public Integer getTeacherId() {
        return teacherId;
    }

    /**
     * 设置教师表自增ID
     *
     * @param teacherId 教师表自增ID
     */
    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    /**
     * 获取教师证明名称
     *
     * @return teacher_name - 教师证明名称
     */
    public String getTeacherName() {
        return teacherName;
    }

    /**
     * 设置教师证明名称
     *
     * @param teacherName 教师证明名称
     */
    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    /**
     * 获取教师证明图片地址
     *
     * @return teacher_img - 教师证明图片地址
     */
    public String getTeacherImg() {
        return teacherImg;
    }

    /**
     * 设置教师证明图片地址
     *
     * @param teacherImg 教师证明图片地址
     */
    public void setTeacherImg(String teacherImg) {
        this.teacherImg = teacherImg;
    }

    /**
     * 获取教师资格标识默认为0
     *
     * @return teacher_mark - 教师资格标识默认为0
     */
    public Integer getTeacherMark() {
        return teacherMark;
    }

    /**
     * 设置教师资格标识默认为0
     *
     * @param teacherMark 教师资格标识默认为0
     */
    public void setTeacherMark(Integer teacherMark) {
        this.teacherMark = teacherMark;
    }

    /**
     * 获取链接用户id
     *
     * @return teacher_user_id - 链接用户id
     */
    public Integer getTeacherUserId() {
        return teacherUserId;
    }

    /**
     * 设置链接用户id
     *
     * @param teacherUserId 链接用户id
     */
    public void setTeacherUserId(Integer teacherUserId) {
        this.teacherUserId = teacherUserId;
    }
}