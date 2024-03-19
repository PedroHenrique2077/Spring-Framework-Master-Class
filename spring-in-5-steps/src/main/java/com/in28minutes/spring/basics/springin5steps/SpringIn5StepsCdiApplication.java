package com.in28minutes.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.in28minutes.spring.basics.springin5steps.cdi.SomeCdiBusiness;

@SpringBootApplication
@ComponentScan
public class SpringIn5StepsCdiApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsCdiApplication.class);

	public static void main(String[] args) {
		try (var applicationContext = new AnnotationConfigApplicationContext(SpringIn5StepsCdiApplication.class)) {
			var business = applicationContext.getBean(SomeCdiBusiness.class);

			LOGGER.info("{} dao-{}", business, business.getSomeCDIDAO());
		}
	}
}