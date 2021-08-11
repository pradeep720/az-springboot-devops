package com.example.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	
	@GetMapping
	public String sayHello() {
		
		return "hello , i am java app spring boot project repository github deployed appservice using azure devops ci/cd ";
		
	}
	

}
