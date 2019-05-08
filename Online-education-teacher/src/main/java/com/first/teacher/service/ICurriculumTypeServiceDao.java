package com.first.teacher.service;

import java.util.List;

import com.first.entity.pojo.CurriculumType;

public interface ICurriculumTypeServiceDao {

	int updEntity(CurriculumType entity);

	List<CurriculumType> allEntity(CurriculumType entity);

}
