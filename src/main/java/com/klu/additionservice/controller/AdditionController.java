package com.klu.additionservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/addition")
public class AdditionController {

	@Value("${server.port}")
	private String port;

	@GetMapping("/add")
	public String add(@RequestParam int a, @RequestParam int b) {
		int result = a + b;
		return "Addition = " + result ;
	}

}
