package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/security-api")
public class DemoOperationController {
    @GetMapping("/msg")  
	public String home() {
		return "good morning";
	}
    
}
