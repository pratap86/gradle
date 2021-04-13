package com.pratap.gradle.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("gradle")
public class HelloGradleController {

	@GetMapping("/hello")
	public String hello() {
		return "Spring Boot with gradle, makes super easy.";
	}
}
