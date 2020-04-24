package com.mfu.MFU_intern_work;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MfuInternWorkApplication {

	public static void main(String[] args) {
		SpringApplication.run(MfuInternWorkApplication.class, args);
		
	}

}
