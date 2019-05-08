package com.first.teacher.service;

import java.util.List;

import com.first.entity.pojo.CurriculumStytem;

public interface ICurriculumStytemServiceDao extends BeanServiceDao<CurriculumStytem> {

	int addCurriculumStytem(CurriculumStytem stylem);

	CurriculumStytem getInfoByBean(CurriculumStytem stylem);

	List<CurriculumStytem> getByIdListStytem(Integer id);
}
