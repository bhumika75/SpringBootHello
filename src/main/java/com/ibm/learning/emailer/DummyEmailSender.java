package com.ibm.learning.emailer;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
//import org.springframework.context.annotation.Primary;


public class DummyEmailSender implements IEmailerService {
	
	//Initialize the logger
	private static Log log=LogFactory.getLog(DummyEmailSender.class);
	
	@Override 
	public void sendEmail(String emailID, String subject, String mailContent) {
		//TODO Auto-generated method stub
		log.info("Dummy Mail receiver ID:"+emailID);
		log.info("Dummy Mail Subject:"+subject);
		log.info("Dummy Mail body ID:"+mailContent);
		log.warn("This is just a Dummy mail sender");
		
	}
	
}
