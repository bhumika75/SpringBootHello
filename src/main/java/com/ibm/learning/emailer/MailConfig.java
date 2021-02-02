package com.ibm.learning.emailer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.mail.javamail.JavaMailSender;

/* This class will be use to configure the beans of 
 * DummyEmailSender.java and SmptEmailSender.java as we may dont have source of these classes
 * but we want to use them as a Spring bean. 
 * 
 */
@Configuration
public class MailConfig {
	//IEmailerService emailService = new DummyEmailSender();
	
    @Bean
	@Profile("dev")
	public IEmailerService dummyEmailSender() {
		return new DummyEmailSender();
	}
	
    @Bean
    @Primary
    @Profile("zomato")
	public IEmailerService smtpEmailSender(JavaMailSender javaMailSender) {
		return new SmtpEmailSender(javaMailSender);
	}
}