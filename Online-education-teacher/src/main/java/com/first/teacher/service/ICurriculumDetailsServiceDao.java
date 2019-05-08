package com.first.teacher.service;

import java.util.List;

import com.first.entity.pojo.CurriculumDetails;

public interface ICurriculumDetailsServiceDao extends BeanServiceDao<CurriculumDetails> {
	int addCurriculumDetails(CurriculumDetails details);

	List<CurriculumDetails> getByIdListDetails(Integer id);
}
