package com.mfu.ProfileService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@EnableDiscoveryClient
@RestController
@RequestMapping("profile")

public class ProfileServiceApplication {
	
	@Value("${server.port}")
	private String port;

	@GetMapping("/port")
	public String ShowPort() {
		return "Profile-Service is running on port : " + port;
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProfileServiceApplication.class, args);
	}

}
