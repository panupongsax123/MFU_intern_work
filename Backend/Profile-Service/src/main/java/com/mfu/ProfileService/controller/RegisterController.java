package com.mfu.ProfileService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mfu.ProfileService.model.Register;
import com.mfu.ProfileService.service.RegisterService;



@RestController
@RequestMapping("users")

public class RegisterController {
	
	@Autowired
    private RegisterService signInService;	
	
	@GetMapping("/show")	 
 	public List<Register> findAll() {

	return signInService.showAllUsers();
}
	
	@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping("/addUser")
	public Register newUsers (@RequestBody Register request ) {
		
		return signInService.addNewUsers(request);
		
	}
	
}
