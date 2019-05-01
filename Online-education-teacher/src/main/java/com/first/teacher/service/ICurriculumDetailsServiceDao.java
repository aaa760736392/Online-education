package com.first.teacher.service;

import com.first.entity.pojo.CurriculumDetails;

public interface ICurriculumDetailsServiceDao extends BeanServiceDao<CurriculumDetails> {
	int addCurriculumDetails(CurriculumDetails details);
}
