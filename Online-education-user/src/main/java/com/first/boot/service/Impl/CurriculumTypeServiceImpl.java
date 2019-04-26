package com.first.boot.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.first.boot.entity.CurriculumType;
import com.first.boot.idao.ICurriculumTypeDao;
import com.first.boot.service.ICurriculumTypeServiceDao;

@Service
public class CurriculumTypeServiceImpl implements ICurriculumTypeServiceDao {

	@Autowired
	private ICurriculumTypeDao icu;

	@Override
	public List<CurriculumType> allEntity() {

		return icu.allEntity();
	}

}
