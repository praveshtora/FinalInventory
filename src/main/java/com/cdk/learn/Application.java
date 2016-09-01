package com.cdk.learn;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.cdk.learn.repo.CustomerRepository;
import com.cdk.learn.test.AppService;

@SpringBootApplication
public class Application {

	@Resource
	private AppService service;

	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}
	
	@Bean
	public CommandLineRunner demo(CustomerRepository repository) {
		return (args) -> {
			service.invoke();
		};
	}

	
}
