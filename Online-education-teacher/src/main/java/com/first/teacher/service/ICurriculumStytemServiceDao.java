package com.first.teacher.service;

import com.first.entity.pojo.CurriculumStytem;

public interface ICurriculumStytemServiceDao extends BeanServiceDao<CurriculumStytem> {

	int addCurriculumStytem(CurriculumStytem stylem);

	CurriculumStytem getInfoByBean(CurriculumStytem stylem);
}
