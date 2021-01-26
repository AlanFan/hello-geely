package com.geely.hellogeely;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloGeelyApplication {

	@GetMapping("/")
	public String hello(){
		return "Hello Geely!";
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloGeelyApplication.class, args);
	}

}
