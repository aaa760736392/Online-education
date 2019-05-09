package com.first.boot.controller.viewConeroller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.first.entity.pojo.CurriculumTotal;
import com.first.entity.pojo.CurriculumType;
import com.first.teacher.service.ICurriculumTotalServiceDao;
import com.first.teacher.service.ICurriculumTypeServiceDao;

@Controller
public class ViewCurriculumTypeConeroller {

	@Autowired
	private ICurriculumTypeServiceDao typeService;

	@Autowired
	private ICurriculumTotalServiceDao currService;

	@RequestMapping("/info")
	public String getInfo(HttpServletRequest res) {
		List<CurriculumType> selectAll = typeService.allEntity(null);
		res.setAttribute("types", selectAll);
		return "addCurriculum";
	}

	@GetMapping("/userCurr")
	public String currs(HttpServletRequest res) {
		CurriculumTotal curr = new CurriculumTotal();
		curr.setCurriculumUserId(1);
		List<CurriculumTotal> byId = currService.getById(curr);
		res.setAttribute("curr", byId);
		List<CurriculumType> selectAll = typeService.allEntity(null);
		res.setAttribute("types", selectAll);
		return "managementcourse";
	}

	@GetMapping("home")
	public String home() {

		return "home";
	}

	@GetMapping("iso")
	public String iso() {
		return "PersonalCenter";
	}

}
