package com.first.boot.idao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.first.boot.entity.CurriculumType;

public interface ICurriculumTypeDao {

	@Select("select * from Curriculum_Type")
	List<CurriculumType> allEntity();
}
