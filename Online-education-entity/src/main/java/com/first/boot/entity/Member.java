package com.first.boot.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "member")
public class Member implements Serializable {
    /**
     * 人员身份表
     */
    @Id
    @Column(name = "Member_id")
    private Integer memberId;

    @Column(name = "Member_name")
    private String memberName;

    private static final long serialVersionUID = 1L;

    /**
     * 获取人员身份表
     *
     * @return Member_id - 人员身份表
     */
    public Integer getMemberId() {
        return memberId;
    }

    /**
     * 设置人员身份表
     *
     * @param memberId 人员身份表
     */
    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    /**
     * @return Member_name
     */
    public String getMemberName() {
        return memberName;
    }

    /**
     * @param memberName
     */
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }
}