package com.nt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/security-api")
public class SecurityOperationController {
      public String getMsg() {
    	  return "good morning";
      }
}
