package com.questions_application.questions_application_0_0_1.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages="com.questions_application.questions_application_0_0_1")
@EnableJpaRepositories(basePackages="com.questions_application.questions_application_0_0_1.repository")
@EntityScan(basePackages="com.questions_application.questions_application_0_0_1.model")
@SpringBootApplication(scanBasePackages = {"com.questions_application.questions_application_0_0_1.app",
		"com.questions_application.questions_application_0_0_1.controller"})

public class QuestionsApplication001Application extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(QuestionsApplication001Application.class, args);
	}

}
