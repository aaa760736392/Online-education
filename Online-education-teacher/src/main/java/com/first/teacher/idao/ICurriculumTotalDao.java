package com.first.teacher.idao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.FetchType;

import com.first.entity.pojo.CurriculumTotal;

import tk.mybatis.mapper.common.Mapper;

public interface ICurriculumTotalDao extends Mapper<CurriculumTotal> {

	@Select("select * from Curriculum_Total where curriculum_user_id = #{userId}")
	List<CurriculumTotal> getByUserIdList(Integer userId);

	@Delete("delete from Curriculum_Total curriculum_id = #{id}")
	int delByIdTotal(Integer id);

	@Select("select curriculum_id from curriculum_total where curriculum_time = #{curriculumTime} ORDER BY curriculum_id desc;")
	int getById(CurriculumTotal ts);

	@Select("select * from curriculum_total where curriculum_user_id = #{curriculumUserId} ")
	@Results({ @Result(id = true, column = "curriculum_id", property = "curriculumId"),
			@Result(column = "curriculum_name", property = "curriculumName"),
			@Result(column = "curriculum_id", property = "setSey", many = @Many(fetchType = FetchType.LAZY, select = "com.first.teacher.idao.ICurriculumStytemDao.getByIdListStytem")) })
	public List<CurriculumTotal> getCurr(CurriculumTotal currs);
}
