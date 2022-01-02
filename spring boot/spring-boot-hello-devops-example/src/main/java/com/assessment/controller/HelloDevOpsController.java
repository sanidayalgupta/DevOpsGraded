package com.assessment.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloDevOpsController {

@RequestMapping("/")
	public String hello() 
	{
		return "Hello Dev-Ops";
	}
}
