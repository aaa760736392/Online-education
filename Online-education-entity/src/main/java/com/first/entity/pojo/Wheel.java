package com.first.entity.pojo;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "wheel")
public class Wheel implements Serializable {
    @Id
    @Column(name = "Wheel_img_id")
    private Integer wheelImgId;

    /**
     * 图片名称
     */
    @Column(name = "Wheel_img_name")
    private String wheelImgName;

    /**
     * 路径
     */
    @Column(name = "wheel_img_url")
    private String wheelImgUrl;

    /**
     * 下标列
     */
    @Column(name = "wheel_img_subscript")
    private Integer wheelImgSubscript;

    /**
     * 标示是否显示
     */
    @Column(name = "wheel_img_Mark")
    private Integer wheelImgMark;

    private static final long serialVersionUID = 1L;

    /**
     * @return Wheel_img_id
     */
    public Integer getWheelImgId() {
        return wheelImgId;
    }

    /**
     * @param wheelImgId
     */
    public void setWheelImgId(Integer wheelImgId) {
        this.wheelImgId = wheelImgId;
    }

    /**
     * 获取图片名称
     *
     * @return Wheel_img_name - 图片名称
     */
    public String getWheelImgName() {
        return wheelImgName;
    }

    /**
     * 设置图片名称
     *
     * @param wheelImgName 图片名称
     */
    public void setWheelImgName(String wheelImgName) {
        this.wheelImgName = wheelImgName;
    }

    /**
     * 获取路径
     *
     * @return wheel_img_url - 路径
     */
    public String getWheelImgUrl() {
        return wheelImgUrl;
    }

    /**
     * 设置路径
     *
     * @param wheelImgUrl 路径
     */
    public void setWheelImgUrl(String wheelImgUrl) {
        this.wheelImgUrl = wheelImgUrl;
    }

    /**
     * 获取下标列
     *
     * @return wheel_img_subscript - 下标列
     */
    public Integer getWheelImgSubscript() {
        return wheelImgSubscript;
    }

    /**
     * 设置下标列
     *
     * @param wheelImgSubscript 下标列
     */
    public void setWheelImgSubscript(Integer wheelImgSubscript) {
        this.wheelImgSubscript = wheelImgSubscript;
    }

    /**
     * 获取标示是否显示
     *
     * @return wheel_img_Mark - 标示是否显示
     */
    public Integer getWheelImgMark() {
        return wheelImgMark;
    }

    /**
     * 设置标示是否显示
     *
     * @param wheelImgMark 标示是否显示
     */
    public void setWheelImgMark(Integer wheelImgMark) {
        this.wheelImgMark = wheelImgMark;
    }
}