package com.mfu.LoadBalancing.clientsideLoadbalancing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication(scanBasePackages={"com.netflix.client.config.IClientConfig"})
@EnableEurekaClient
@RestController
@RequestMapping("load")
@RibbonClient(name = "profile-service,content-service",configuration = RibbonConfiguration.class)
public class ClientSideLoadBalancingApplication {
		
	@Autowired
	private RestTemplate template;
	
	public static void main(String[] args) {
		SpringApplication.run(ClientSideLoadBalancingApplication.class, args);
	}
	
	
	@GetMapping("/invoke")
	public String invokeShowPort() {
		String url = "http://Profile-Service/profile/port";
		return template.getForObject(url, String.class);
	}
	
	@GetMapping("/content")
	public String invokeShowPortContent() {
		String url = "http://Content-Service/content/port";
		return template.getForObject(url, String.class);
	}
	
	
	@Bean
	@LoadBalanced
	public RestTemplate template() {
		return new RestTemplate();
	}
	
}

