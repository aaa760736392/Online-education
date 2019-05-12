package com.first.teacher.service;

import java.io.FileNotFoundException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.first.entity.pojo.CurriculumTotal;

/**
 * 主要负责涉及到多个service进行同时操作
 * 
 * @author Administrator
 *
 */

public interface IGatherServiceDao {

	int addCourse(CurriculumTotal total);

	int delCourse(CurriculumTotal total);

	boolean updCourse(CurriculumTotal total);

	boolean manyFileUplode(List<MultipartFile> files, CurriculumTotal total) throws FileNotFoundException;
}
