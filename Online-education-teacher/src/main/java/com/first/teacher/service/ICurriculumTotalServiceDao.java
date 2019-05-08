package com.first.teacher.service;

import java.util.List;

import com.first.entity.pojo.CurriculumTotal;
import com.first.entity.pojo.UserLogin;

public interface ICurriculumTotalServiceDao extends BeanServiceDao<CurriculumTotal> {
	int addCurriculumTotal(CurriculumTotal curr);

	CurriculumTotal getInfoByBean(CurriculumTotal curr);

	List<CurriculumTotal> getByUserIdList(UserLogin user);

	List<CurriculumTotal> getById(CurriculumTotal curr);

}
