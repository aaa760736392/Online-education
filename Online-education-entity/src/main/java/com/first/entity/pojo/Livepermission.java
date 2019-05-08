package com.first.entity.pojo;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "livepermission")
public class Livepermission implements Serializable {
    /**
     * 自增ID
     */
    @Id
    @Column(name = "Live_id")
    private Integer liveId;

    /**
     * 直播间标题
     */
    @Column(name = "Live_name")
    private String liveName;

    /**
     * 串流地址
     */
    @Column(name = "Live_url")
    private String liveUrl;

    /**
     * 串流密码
     */
    @Column(name = "Live_pwd")
    private String livePwd;

    /**
     * 是哪个用户保存的直播信息
     */
    @Column(name = "Live_user_id")
    private Integer liveUserId;

    private static final long serialVersionUID = 1L;

    /**
     * 获取自增ID
     *
     * @return Live_id - 自增ID
     */
    public Integer getLiveId() {
        return liveId;
    }

    /**
     * 设置自增ID
     *
     * @param liveId 自增ID
     */
    public void setLiveId(Integer liveId) {
        this.liveId = liveId;
    }

    /**
     * 获取直播间标题
     *
     * @return Live_name - 直播间标题
     */
    public String getLiveName() {
        return liveName;
    }

    /**
     * 设置直播间标题
     *
     * @param liveName 直播间标题
     */
    public void setLiveName(String liveName) {
        this.liveName = liveName;
    }

    /**
     * 获取串流地址
     *
     * @return Live_url - 串流地址
     */
    public String getLiveUrl() {
        return liveUrl;
    }

    /**
     * 设置串流地址
     *
     * @param liveUrl 串流地址
     */
    public void setLiveUrl(String liveUrl) {
        this.liveUrl = liveUrl;
    }

    /**
     * 获取串流密码
     *
     * @return Live_pwd - 串流密码
     */
    public String getLivePwd() {
        return livePwd;
    }

    /**
     * 设置串流密码
     *
     * @param livePwd 串流密码
     */
    public void setLivePwd(String livePwd) {
        this.livePwd = livePwd;
    }

    /**
     * 获取是哪个用户保存的直播信息
     *
     * @return Live_user_id - 是哪个用户保存的直播信息
     */
    public Integer getLiveUserId() {
        return liveUserId;
    }

    /**
     * 设置是哪个用户保存的直播信息
     *
     * @param liveUserId 是哪个用户保存的直播信息
     */
    public void setLiveUserId(Integer liveUserId) {
        this.liveUserId = liveUserId;
    }
}