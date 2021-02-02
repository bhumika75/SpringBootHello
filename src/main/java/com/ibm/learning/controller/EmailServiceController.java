package com.ibm.learning.controller;


import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.learning.emailer.IEmailerService;

@RestController
public class EmailServiceController {
	
	//IEmailerService emailService= new DummyEmailSender();
	
	//@Autowired   //at instance variable   
	IEmailerService emailService;
	
	public IEmailerService getEmailService() {
		return emailService;
	}
	
	/*@Autowired //at setter method
	public void setEmailService(IEmailerService emailService) {
		this.emailService=emailService;
	}*/
	//Autowired using Constructor
	@Autowired
	public EmailServiceController(IEmailerService abc) {
		this.emailService= abc; 
	}
	// http://localhost:8080/sendemail
	@RequestMapping("/sendemail")
	public String email() throws MessagingException{
		emailService.sendEmail("stevejobs@apple.com","Launching of new Apple-Mobile","Body of the email");
		return "Email Sent";
	}
	
	

}
