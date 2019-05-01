package com.first.entity.pojo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "interview")
public class Interview implements Serializable {
	/**
	 * 面试题表自增id
	 */
	@Id
	@Column(name = "interview_id")
	private Integer interviewId;

	/**
	 * 面试题名称
	 */
	@Column(name = "interview_name")
	private String interviewName;

	/**
	 * 面试题回答
	 */
	@Column(name = "interview_interview")
	private String interviewInterview;

	/**
	 * 面试类型
	 */
	@Column(name = "interview_type")
	private Integer interviewType;

	/**
	 * 录入时间
	 */
	@Column(name = "interview_time")
	private Date interviewTime;

	/**
	 * 出题人ID
	 */
	@Column(name = "interview_user_id")
	private Integer interviewUserId;

	private static final long serialVersionUID = 1L;

	/**
	 * 获取面试题表自增id
	 *
	 * @return interview_id - 面试题表自增id
	 */
	public Integer getInterviewId() {
		return interviewId;
	}

	/**
	 * 设置面试题表自增id
	 *
	 * @param interviewId 面试题表自增id
	 */
	public void setInterviewId(Integer interviewId) {
		this.interviewId = interviewId;
	}

	/**
	 * 获取面试题名称
	 *
	 * @return interview_name - 面试题名称
	 */
	public String getInterviewName() {
		return interviewName;
	}

	/**
	 * 设置面试题名称
	 *
	 * @param interviewName 面试题名称
	 */
	public void setInterviewName(String interviewName) {
		this.interviewName = interviewName;
	}

	/**
	 * 获取面试题回答
	 *
	 * @return interview_interview - 面试题回答
	 */
	public String getInterviewInterview() {
		return interviewInterview;
	}

	/**
	 * 设置面试题回答
	 *
	 * @param interviewInterview 面试题回答
	 */
	public void setInterviewInterview(String interviewInterview) {
		this.interviewInterview = interviewInterview;
	}

	/**
	 * 获取面试类型
	 *
	 * @return interview_type - 面试类型
	 */
	public Integer getInterviewType() {
		return interviewType;
	}

	/**
	 * 设置面试类型
	 *
	 * @param interviewType 面试类型
	 */
	public void setInterviewType(Integer interviewType) {
		this.interviewType = interviewType;
	}

	/**
	 * 获取录入时间
	 *
	 * @return interview_time - 录入时间
	 */
	public Date getInterviewTime() {
		return interviewTime;
	}

	/**
	 * 设置录入时间
	 *
	 * @param interviewTime 录入时间
	 */
	public void setInterviewTime(Date interviewTime) {
		this.interviewTime = interviewTime;
	}

	/**
	 * 获取出题人ID
	 *
	 * @return interview_user_id - 出题人ID
	 */
	public Integer getInterviewUserId() {
		return interviewUserId;
	}

	/**
	 * 设置出题人ID
	 *
	 * @param interviewUserId 出题人ID
	 */
	public void setInterviewUserId(Integer interviewUserId) {
		this.interviewUserId = interviewUserId;
	}
}