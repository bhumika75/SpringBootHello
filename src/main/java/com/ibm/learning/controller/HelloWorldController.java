package com.ibm.learning.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldController {
	
	@Value("${app.smpt.name}")
	private String smtpName;
	
	// Expose theAPI as a web service so that this API will be available over http protocol
	// http://localhost:8080/hello
			
	@RequestMapping("/hello")
	public String hello() {
				
			return "Hello Modern Students"+smtpName;
		}
			
	}





