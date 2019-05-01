package com.first.teacher.service;

import java.util.List;

import com.first.entity.pojo.CurriculumDetails;
import com.first.entity.pojo.CurriculumStytem;
import com.first.entity.pojo.CurriculumTotal;

/**
 * 主要负责涉及到多个service进行同时操作
 * 
 * @author Administrator
 *
 */

public interface IGatherServiceDao {

	int addCourse(CurriculumTotal total, List<CurriculumStytem> stytem, List<CurriculumDetails> details);

}
