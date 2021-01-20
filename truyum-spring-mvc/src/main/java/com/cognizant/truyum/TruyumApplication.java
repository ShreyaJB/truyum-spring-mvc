package com.cognizant.truyum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
/**
 * 
 * @author Ayush Srivastava
 *
 */
@SpringBootApplication
@ComponentScan({"com.cognizant.truyum","com.cognizant.truyum.controller","com.cognizant.truyum.model","com.cognizant.truyum.dao","com.cognizant.truyum.service"})
public class TruyumApplication {

	public static void main(String[] args) {
		SpringApplication.run(TruyumApplication.class, args);
	}

}
