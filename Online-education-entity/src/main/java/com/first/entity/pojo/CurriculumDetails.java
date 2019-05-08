package com.first.entity.pojo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "curriculum_details")
public class CurriculumDetails implements Serializable {
	/**
	 * 课程详细表ID
	 */
	@Id
	@Column(name = "curriculum_details_id")
	private Integer curriculumDetailsId;

	/**
	 * 课程详情名称
	 */
	@Column(name = "curriculum_details_name")
	private String curriculumDetailsName;

	/**
	 * 课程回放地址
	 */
	@Column(name = "curriculum_details_playback")
	private String curriculumDetailsPlayback;

	/**
	 * 直播时间
	 */
	@Column(name = "curriculum_details_time")
	private String curriculumDetailsTime;

	/**
	 * 课程体系表ID
	 */
	@Column(name = "curriculum_details_stytem_id")
	private Integer curriculumDetailsStytemId;

	private static final long serialVersionUID = 1L;

	/**
	 * 获取课程详细表ID
	 *
	 * @return curriculum_details_id - 课程详细表ID
	 */
	public Integer getCurriculumDetailsId() {
		return curriculumDetailsId;
	}

	/**
	 * 设置课程详细表ID
	 *
	 * @param curriculumDetailsId 课程详细表ID
	 */
	public void setCurriculumDetailsId(Integer curriculumDetailsId) {
		this.curriculumDetailsId = curriculumDetailsId;
	}

	/**
	 * 获取课程详情名称
	 *
	 * @return curriculum_details_name - 课程详情名称
	 */
	public String getCurriculumDetailsName() {
		return curriculumDetailsName;
	}

	/**
	 * 设置课程详情名称
	 *
	 * @param curriculumDetailsName 课程详情名称
	 */
	public void setCurriculumDetailsName(String curriculumDetailsName) {
		this.curriculumDetailsName = curriculumDetailsName;
	}

	/**
	 * 获取课程回放地址
	 *
	 * @return curriculum_details_playback - 课程回放地址
	 */
	public String getCurriculumDetailsPlayback() {
		return curriculumDetailsPlayback;
	}

	/**
	 * 设置课程回放地址
	 *
	 * @param curriculumDetailsPlayback 课程回放地址
	 */
	public void setCurriculumDetailsPlayback(String curriculumDetailsPlayback) {
		this.curriculumDetailsPlayback = curriculumDetailsPlayback;
	}

	/**
	 * 获取直播时间
	 *
	 * @return curriculum_details_time - 直播时间
	 */
	public String getCurriculumDetailsTime() {
		return curriculumDetailsTime;
	}

	/**
	 * 设置直播时间
	 *
	 * @param curriculumDetailsTime 直播时间
	 */
	public void setCurriculumDetailsTime(String curriculumDetailsTime) {
		this.curriculumDetailsTime = curriculumDetailsTime;
	}

	/**
	 * 获取课程体系表ID
	 *
	 * @return curriculum_details_stytem_id - 课程体系表ID
	 */
	public Integer getCurriculumDetailsStytemId() {
		return curriculumDetailsStytemId;
	}

	/**
	 * 设置课程体系表ID
	 *
	 * @param curriculumDetailsStytemId 课程体系表ID
	 */
	public void setCurriculumDetailsStytemId(Integer curriculumDetailsStytemId) {
		this.curriculumDetailsStytemId = curriculumDetailsStytemId;
	}
}