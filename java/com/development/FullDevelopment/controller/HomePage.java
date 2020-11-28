package com.development.FullDevelopment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePage {


	@GetMapping("/api/hello")
	public String getHello() {
		return "Welcome to Spring boot Application";
	}
}
