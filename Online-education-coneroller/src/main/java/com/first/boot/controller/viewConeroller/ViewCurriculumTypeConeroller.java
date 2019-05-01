package com.first.boot.controller.viewConeroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.first.boot.entity.Name;
import com.first.boot.entity.Users;

@Controller
public class ViewCurriculumTypeConeroller {

	@RequestMapping("/info")
	public String getInfo(Users user) {
		for (Name name : user.getNames()) {
			System.out.println(name);
		}
		return "show";
	}
}
