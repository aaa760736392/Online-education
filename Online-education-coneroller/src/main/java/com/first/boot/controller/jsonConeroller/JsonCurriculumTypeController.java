package com.first.boot.controller.jsonConeroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.first.boot.entity.CurriculumType;
import com.first.boot.service.ICurriculumTypeServiceDao;

@RestController
public class JsonCurriculumTypeController {

	@Autowired
	private ICurriculumTypeServiceDao icu;

	@RequestMapping("/all")
	public List<CurriculumType> allEntity() {
		return icu.allEntity();
	}

}
