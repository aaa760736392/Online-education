package com.first.boot.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "course_learning_records")
public class CourseLearningRecords implements Serializable {
    /**
     * 课程学习记录表ID
     */
    @Id
    @Column(name = "Course_Learning_Records_id")
    private Integer courseLearningRecordsId;

    /**
     * 课程详细表
     */
    @Column(name = "Course_Learning_Records_details_id")
    private Integer courseLearningRecordsDetailsId;

    /**
     * 记录回放时间
     */
    @Column(name = "Course_Learning_Records_playback")
    private String courseLearningRecordsPlayback;

    private static final long serialVersionUID = 1L;

    /**
     * 获取课程学习记录表ID
     *
     * @return Course_Learning_Records_id - 课程学习记录表ID
     */
    public Integer getCourseLearningRecordsId() {
        return courseLearningRecordsId;
    }

    /**
     * 设置课程学习记录表ID
     *
     * @param courseLearningRecordsId 课程学习记录表ID
     */
    public void setCourseLearningRecordsId(Integer courseLearningRecordsId) {
        this.courseLearningRecordsId = courseLearningRecordsId;
    }

    /**
     * 获取课程详细表
     *
     * @return Course_Learning_Records_details_id - 课程详细表
     */
    public Integer getCourseLearningRecordsDetailsId() {
        return courseLearningRecordsDetailsId;
    }

    /**
     * 设置课程详细表
     *
     * @param courseLearningRecordsDetailsId 课程详细表
     */
    public void setCourseLearningRecordsDetailsId(Integer courseLearningRecordsDetailsId) {
        this.courseLearningRecordsDetailsId = courseLearningRecordsDetailsId;
    }

    /**
     * 获取记录回放时间
     *
     * @return Course_Learning_Records_playback - 记录回放时间
     */
    public String getCourseLearningRecordsPlayback() {
        return courseLearningRecordsPlayback;
    }

    /**
     * 设置记录回放时间
     *
     * @param courseLearningRecordsPlayback 记录回放时间
     */
    public void setCourseLearningRecordsPlayback(String courseLearningRecordsPlayback) {
        this.courseLearningRecordsPlayback = courseLearningRecordsPlayback;
    }
}