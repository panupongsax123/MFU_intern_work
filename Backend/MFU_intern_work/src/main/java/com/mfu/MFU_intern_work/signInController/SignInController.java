package com.mfu.MFU_intern_work.signInController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mfu.MFU_intern_work.model_signIn.SignIn;
import com.mfu.MFU_intern_work.signInService.SignInService;

@RestController
@RequestMapping(value = "register")
public class SignInController {
	
	@Autowired
    private SignInService signInService;	
	
	@PostMapping("/addUser")
	public SignIn newUser(@RequestBody SignIn request) {
		                        
                return signInService.signInAdd(request);
	}
}
