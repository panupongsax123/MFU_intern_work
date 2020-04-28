package com.mfu.ProfileService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.mfu.ProfileService.model.Register;
import com.mfu.ProfileService.repository.RegisterRepository;


@Service("SignInService")
public class RegisterService {

	@Autowired
    private RegisterRepository repository;
	

	public List<Register> showAllUsers(){
		
		System.out.println("Show all users.");
		List<Register> valueShow = repository.findAll();
		return valueShow;
		
	}
	
	public Register addNewUsers (@RequestBody Register request) {
		
		Register newUsers = new Register();
		
		newUsers.setId(request.getId());
		newUsers.setUsername(request.getUsername());
		newUsers.setPassword(request.getPassword());
		newUsers.setNickname(request.getNickname());
		newUsers.setEmail(request.getEmail());
		
		repository.save(request);
		
		System.out.println(request.getUsername());
		System.out.println(request.getPassword());
		
		return newUsers;
	}
}
