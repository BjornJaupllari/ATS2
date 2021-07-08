package com.example.ATS2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//@EnableEurekaClient
public class Ats2Application {

	public static void main(String[] args) {
		SpringApplication.run(Ats2Application.class, args);
	}

}
