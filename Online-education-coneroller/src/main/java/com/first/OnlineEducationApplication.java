package com.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan({ "com.first.teacher.idao", "com.first.admin.idao" })
public class OnlineEducationApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineEducationApplication.class, args);
	}

}
