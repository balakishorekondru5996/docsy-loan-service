package com.tech.docsy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DocsyLoanServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DocsyLoanServiceApplication.class, args);
	}

}
