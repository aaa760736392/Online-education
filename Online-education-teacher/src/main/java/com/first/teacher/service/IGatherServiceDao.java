package com.first.teacher.service;

import com.first.entity.pojo.CurriculumTotal;

/**
 * 主要负责涉及到多个service进行同时操作
 * 
 * @author Administrator
 *
 */

public interface IGatherServiceDao {

	int addCourse(CurriculumTotal total);

	int delCourse(CurriculumTotal total);
}
