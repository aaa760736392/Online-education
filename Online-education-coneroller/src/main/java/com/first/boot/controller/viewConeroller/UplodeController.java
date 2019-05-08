package com.first.boot.controller.viewConeroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.first.entity.pojo.CurriculumTotal;

@Controller
public class UplodeController {

	@PostMapping("/stas")
	public String cols(CurriculumTotal curr) {
		System.out.println(curr);
		return "show";
	}

	@GetMapping("infos")
	public String colo() {
		return "addCurriculum";
	}

}
