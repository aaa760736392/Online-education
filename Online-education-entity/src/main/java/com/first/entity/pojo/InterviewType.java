package com.first.entity.pojo;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "interview_type")
public class InterviewType implements Serializable {
    @Id
    @Column(name = "interview_type_id")
    private Integer interviewTypeId;

    @Column(name = "interview_type_name")
    private String interviewTypeName;

    private static final long serialVersionUID = 1L;

    /**
     * @return interview_type_id
     */
    public Integer getInterviewTypeId() {
        return interviewTypeId;
    }

    /**
     * @param interviewTypeId
     */
    public void setInterviewTypeId(Integer interviewTypeId) {
        this.interviewTypeId = interviewTypeId;
    }

    /**
     * @return interview_type_name
     */
    public String getInterviewTypeName() {
        return interviewTypeName;
    }

    /**
     * @param interviewTypeName
     */
    public void setInterviewTypeName(String interviewTypeName) {
        this.interviewTypeName = interviewTypeName;
    }
}