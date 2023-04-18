package com.cos.security1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	@GetMapping({"", "/"})
	public String index() {
		// 기본폴더 src/main/resources/
		return "index";
	}
}
