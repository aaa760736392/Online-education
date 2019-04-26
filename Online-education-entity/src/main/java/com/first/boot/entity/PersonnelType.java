package com.first.boot.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "personnel_type")
public class PersonnelType implements Serializable {
    /**
     * 人员类型ID
     */
    @Id
    @Column(name = "per_id")
    private Integer perId;

    /**
     * 人员类型名称
     */
    @Column(name = "per_name")
    private String perName;

    private static final long serialVersionUID = 1L;

    /**
     * 获取人员类型ID
     *
     * @return per_id - 人员类型ID
     */
    public Integer getPerId() {
        return perId;
    }

    /**
     * 设置人员类型ID
     *
     * @param perId 人员类型ID
     */
    public void setPerId(Integer perId) {
        this.perId = perId;
    }

    /**
     * 获取人员类型名称
     *
     * @return per_name - 人员类型名称
     */
    public String getPerName() {
        return perName;
    }

    /**
     * 设置人员类型名称
     *
     * @param perName 人员类型名称
     */
    public void setPerName(String perName) {
        this.perName = perName;
    }
}