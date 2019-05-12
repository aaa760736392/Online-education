package com.first.boot.controller.viewConeroller;

import java.io.FileNotFoundException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.first.boot.controller.jsonConeroller.JsonCurriculumTotalController;
import com.first.entity.pojo.CurriculumTotal;
import com.first.teacher.service.IGatherServiceDao;

@RestController
public class ViewCurriculumTotalController {

	private static final Logger LOGGER = LoggerFactory.getLogger(JsonCurriculumTotalController.class);

	@Autowired
	private IGatherServiceDao gathService;

	@PostMapping("updCurr")
	public String updCurr(HttpServletRequest request, CurriculumTotal total) throws FileNotFoundException {
		List<MultipartFile> files = ((MultipartHttpServletRequest) request).getFiles("file");

		gathService.manyFileUplode(files, total);

		return "";
	}

}
