package com.Rest.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@EnableAutoConfiguration
@Configuration
@ComponentScan(basePackages = "com.Rest.vendor")
public class Main {
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

	@GetMapping("/hello")
	public String hello() {
		return "Hello";
	}
}
