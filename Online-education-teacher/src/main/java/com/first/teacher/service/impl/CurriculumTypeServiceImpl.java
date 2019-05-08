package com.first.teacher.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.first.entity.pojo.CurriculumType;
import com.first.teacher.idao.ICurriculumTypeDao;
import com.first.teacher.service.ICurriculumTypeServiceDao;

@Service
public class CurriculumTypeServiceImpl implements ICurriculumTypeServiceDao {

	@Autowired
	private ICurriculumTypeDao icuDao;

	@Override
	public List<CurriculumType> allEntity(CurriculumType entity) {
		if (entity == null) {
			return icuDao.selectAll();
		}
		return icuDao.select(entity);
	}

	@Override
	public int updEntity(CurriculumType entity) {
		return 0;
	}

}
