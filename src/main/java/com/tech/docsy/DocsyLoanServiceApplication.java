package com.tech.docsy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DocsyLoanServiceApplication {
	
	void display() {
		System.out.println("docsy-loan-service---dev/2.0.0");
	}
	
	void show() {
		System.out.println("docsy-loan-service---dev/2.0.0");
	}


	public static void main(String[] args) {
		SpringApplication.run(DocsyLoanServiceApplication.class, args);
	}

}
