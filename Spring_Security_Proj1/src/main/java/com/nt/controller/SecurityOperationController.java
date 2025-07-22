package com.nt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SecurityOperationController {
	@GetMapping("/msg")
      public String getMsg() {
    	  return "good morning kuku have a nice day";
      }
}
