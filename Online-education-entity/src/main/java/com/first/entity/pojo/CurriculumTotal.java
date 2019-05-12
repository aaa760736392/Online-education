package com.first.entity.pojo;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "curriculum_total")
public class CurriculumTotal implements Serializable {
	/**
	 * 自增id
	 */
	@Id
	@Column(name = "curriculum_id")
	private Integer curriculumId;

	/**
	 * 课程名称
	 */
	@Column(name = "curriculum_name")
	private String curriculumName;

	/**
	 * 图片名称
	 */
	@Column(name = "curriculum_img")
	private String curriculumImg;

	/**
	 * 浏览量
	 */
	@Column(name = "curriculum_browse")
	private Integer curriculumBrowse;

	/**
	 * 面向的人员分类
	 */
	@Column(name = "curriculum_member_id")
	private Integer curriculumMemberId;

	/**
	 * 时间
	 */
	@Column(name = "curriculum_time")
	private String curriculumTime;

	/**
	 * 课程介绍
	 */
	@Column(name = "curriculum_details")
	private String curriculumDetails;

	/**
	 * 关联用户ID
	 */
	@Column(name = "curriculum_user_id")
	private Integer curriculumUserId;

	/**
	 * 是否有回放
	 */
	@Column(name = "curriculum_playback")
	private String curriculumPlayback;

	/**
	 * 课程的类型ID
	 */
	@Column(name = "curriculum_type_id")
	private Integer curriculumTypeId;

	private Set<CurriculumStytem> setSey;

	public Set<CurriculumStytem> getSetSey() {
		return setSey;
	}

	public void setSetSey(Set<CurriculumStytem> setSey) {
		this.setSey = setSey;
	}

	private List<CurriculumStytem> stytems;

	public List<CurriculumStytem> getStytems() {
		return stytems;
	}

	public void setStytems(List<CurriculumStytem> stytems) {
		this.stytems = stytems;
	}

	private static final long serialVersionUID = 1L;

	/**
	 * 获取自增id
	 *
	 * @return curriculum_id - 自增id
	 */
	public Integer getCurriculumId() {
		return curriculumId;
	}

	/**
	 * 设置自增id
	 *
	 * @param curriculumId 自增id
	 */
	public void setCurriculumId(Integer curriculumId) {
		this.curriculumId = curriculumId;
	}

	/**
	 * 获取课程名称
	 *
	 * @return curriculum_name - 课程名称
	 */
	public String getCurriculumName() {
		return curriculumName;
	}

	/**
	 * 设置课程名称
	 *
	 * @param curriculumName 课程名称
	 */
	public void setCurriculumName(String curriculumName) {
		this.curriculumName = curriculumName;
	}

	/**
	 * 获取图片名称
	 *
	 * @return curriculum_img - 图片名称
	 */
	public String getCurriculumImg() {
		return curriculumImg;
	}

	/**
	 * 设置图片名称
	 *
	 * @param curriculumImg 图片名称
	 */
	public void setCurriculumImg(String curriculumImg) {
		this.curriculumImg = curriculumImg;
	}

	/**
	 * 获取浏览量
	 *
	 * @return curriculum_browse - 浏览量
	 */
	public Integer getCurriculumBrowse() {
		return curriculumBrowse;
	}

	/**
	 * 设置浏览量
	 *
	 * @param curriculumBrowse 浏览量
	 */
	public void setCurriculumBrowse(Integer curriculumBrowse) {
		this.curriculumBrowse = curriculumBrowse;
	}

	/**
	 * 获取面向的人员分类
	 *
	 * @return curriculum_member_id - 面向的人员分类
	 */
	public Integer getCurriculumMemberId() {
		return curriculumMemberId;
	}

	/**
	 * 设置面向的人员分类
	 *
	 * @param curriculumMemberId 面向的人员分类
	 */
	public void setCurriculumMemberId(Integer curriculumMemberId) {
		this.curriculumMemberId = curriculumMemberId;
	}

	/**
	 * 获取时间
	 *
	 * @return curriculum_time - 时间
	 */
	public String getCurriculumTime() {
		return curriculumTime;
	}

	/**
	 * 设置时间
	 *
	 * @param curriculumTime 时间
	 */
	public void setCurriculumTime(String curriculumTime) {
		this.curriculumTime = curriculumTime;
	}

	/**
	 * 获取课程介绍
	 *
	 * @return curriculum_details - 课程介绍
	 */
	public String getCurriculumDetails() {
		return curriculumDetails;
	}

	/**
	 * 设置课程介绍
	 *
	 * @param curriculumDetails 课程介绍
	 */
	public void setCurriculumDetails(String curriculumDetails) {
		this.curriculumDetails = curriculumDetails;
	}

	/**
	 * 获取关联用户ID
	 *
	 * @return curriculum_user_id - 关联用户ID
	 */
	public Integer getCurriculumUserId() {
		return curriculumUserId;
	}

	/**
	 * 设置关联用户ID
	 *
	 * @param curriculumUserId 关联用户ID
	 */
	public void setCurriculumUserId(Integer curriculumUserId) {
		this.curriculumUserId = curriculumUserId;
	}

	/**
	 * 获取是否有回放
	 *
	 * @return curriculum_playback - 是否有回放
	 */
	public String getCurriculumPlayback() {
		return curriculumPlayback;
	}

	/**
	 * 设置是否有回放
	 *
	 * @param curriculumPlayback 是否有回放
	 */
	public void setCurriculumPlayback(String curriculumPlayback) {
		this.curriculumPlayback = curriculumPlayback;
	}

	/**
	 * 获取课程的类型ID
	 *
	 * @return curriculum_type_id - 课程的类型ID
	 */
	public Integer getCurriculumTypeId() {
		return curriculumTypeId;
	}

	/**
	 * 设置课程的类型ID
	 *
	 * @param curriculumTypeId 课程的类型ID
	 */
	public void setCurriculumTypeId(Integer curriculumTypeId) {
		this.curriculumTypeId = curriculumTypeId;
	}
}