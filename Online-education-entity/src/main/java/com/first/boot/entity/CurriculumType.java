package com.first.boot.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "curriculum_type")
public class CurriculumType implements Serializable {
    /**
     * 课程类型ID
     */
    @Id
    @Column(name = "curriculum_id")
    private Integer curriculumId;

    /**
     * 课程类型名称
     */
    @Column(name = "curriculum_name")
    private String curriculumName;

    private static final long serialVersionUID = 1L;

    /**
     * 获取课程类型ID
     *
     * @return curriculum_id - 课程类型ID
     */
    public Integer getCurriculumId() {
        return curriculumId;
    }

    /**
     * 设置课程类型ID
     *
     * @param curriculumId 课程类型ID
     */
    public void setCurriculumId(Integer curriculumId) {
        this.curriculumId = curriculumId;
    }

    /**
     * 获取课程类型名称
     *
     * @return curriculum_name - 课程类型名称
     */
    public String getCurriculumName() {
        return curriculumName;
    }

    /**
     * 设置课程类型名称
     *
     * @param curriculumName 课程类型名称
     */
    public void setCurriculumName(String curriculumName) {
        this.curriculumName = curriculumName;
    }
}