package com.example.demo.securityPart.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@CrossOrigin
public class HelloWorldController {


	@RequestMapping(value = "/hello", method = RequestMethod.POST)
//	@CrossOrigin(origins = {"http://localhost:3000"})
	public String firstPage() {
		return "{\"firstName\":\"John\", \"lastName\":\"Doe\"}";
	}

}