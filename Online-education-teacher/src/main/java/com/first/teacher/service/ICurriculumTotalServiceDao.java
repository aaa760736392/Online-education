package com.first.teacher.service;

import com.first.entity.pojo.CurriculumTotal;

public interface ICurriculumTotalServiceDao extends BeanServiceDao<CurriculumTotal> {
	int addCurriculumTotal(CurriculumTotal curr);

	CurriculumTotal getInfoByBean(CurriculumTotal curr);

}
