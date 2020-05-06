//package com.mfu.LoadBalancing.clientsideLoadbalancing.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.client.RestTemplate;
//
//@EnableDiscoveryClient
//@RestController
//public class ClientSideController {	
//	
//	@Autowired
//	private RestTemplate template;
//	
//	@GetMapping("/invoke")
//	public String invokeShowPort() {
//		String url = "http://Profile-Service/profile/port";
//		return template.getForObject(url , String.class);
//	}
//}
