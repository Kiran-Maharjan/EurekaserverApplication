package com.kiran.EurekaserverApplication.EurekaserverApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import javax.annotation.PostConstruct;

@SpringBootApplication
@EnableEurekaServer
public class EurekaserverApplication {
	public static Logger logger= LoggerFactory.getLogger(EurekaserverApplication.class);
	@PostConstruct
	public void init() throws Exception {
		logger.info("Initializing EurekaserverApplication....");
	}
	public static void main(String[] args) {
		logger.info("Starting EurekaserverApplication....");
		SpringApplication.run(EurekaserverApplication.class, args);
	}

}
