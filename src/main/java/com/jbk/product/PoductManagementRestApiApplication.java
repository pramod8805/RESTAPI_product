package com.jbk.product;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;


@SpringBootApplication
//@EnableEurekaClient
public class PoductManagementRestApiApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(PoductManagementRestApiApplication.class);
	
	public static void main(String[] args){
		SpringApplication.run(PoductManagementRestApiApplication.class, args);
	LOGGER.info("Application Started ..");
	}
	
	@Bean
	public CommonsMultipartResolver commonsMultipartResolver() {
		return new CommonsMultipartResolver();
	}
	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	
}
