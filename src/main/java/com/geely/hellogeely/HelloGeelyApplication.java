package com.geely.hellogeely;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import sun.misc.VM;

import java.net.InetAddress;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
public class HelloGeelyApplication {
	List list  =  new ArrayList();
	@GetMapping("/")
	public String hello() throws Exception{
		System.out.println(VM.maxDirectMemory());
		return "Hello Geely!" + InetAddress.getLocalHost().getHostName();
	}

	@GetMapping("/test/{size}")
	public String test(@PathVariable int size){

		list.add(ByteBuffer.allocateDirect(1024*1024*size));
		return "";
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloGeelyApplication.class, args);
	}
}
