package com.geely.hellogeely;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.misc.VM;

import java.net.InetAddress;

@SpringBootApplication
@RestController
public class HelloGeelyApplication {

	@GetMapping("/")
	public String hello() throws Exception{
		System.out.println(VM.maxDirectMemory());
		return "Hello Geely!" + InetAddress.getLocalHost().getHostName();
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloGeelyApplication.class, args);
	}
}
