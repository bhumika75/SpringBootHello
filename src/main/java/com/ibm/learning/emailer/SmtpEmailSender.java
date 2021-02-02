package com.ibm.learning.emailer;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;


public class SmtpEmailSender implements IEmailerService {
	//Initialize the logger
		private static Log log=LogFactory.getLog(SmtpEmailSender.class);
		private JavaMailSender javaMailSender;

		public SmtpEmailSender(JavaMailSender javaMailSender) {
			// TODO Auto-generated constructor stub
			this.javaMailSender = javaMailSender;
		}


		@Override 
		public void sendEmail(String emailID, String subject, String mailContent) throws MessagingException{
			//TODO Auto-generated method stub
			log.info("SMTP Mail receiver ID:"+emailID);
			log.info("SMTP Mail Subject:"+subject);
			log.info("SMTP Mail body ID:"+mailContent);
			log.warn("This is just a SMTP mail sender");
			
			MimeMessage message = javaMailSender.createMimeMessage();
			MimeMessageHelper helper;

			helper = new MimeMessageHelper(message, true); // true indicates
	 					  				                   // multipart message
			
			helper.setSubject("This is test message");
			helper.setTo("waghmalebhumika@gmail.com");
			helper.setText("<h1> Body </h1>", true); // true indicates html

			// continue using helper for more functionalities
	        // like adding attachments, etc.  
			
			javaMailSender.send(message);
		}
}
