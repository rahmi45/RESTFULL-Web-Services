package com.spring.restfull.config.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/main")
public class MainController {
	
	@GetMapping(value = "/sport")
	public String getMain() {
		return "HI My Sport...";
	}

}
