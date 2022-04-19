package com.example.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRest {
	
	@GetMapping("/")
	public String getResponse() {
		return "Hi Its working ";
	}

}
