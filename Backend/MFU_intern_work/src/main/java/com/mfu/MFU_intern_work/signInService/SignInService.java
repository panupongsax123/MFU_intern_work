package com.mfu.MFU_intern_work.signInService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import com.mfu.MFU_intern_work.model_signIn.SignIn;
import com.mfu.MFU_intern_work.signInRepository.SignInRepository;

@Service("SignInService")
public class SignInService {

	@Autowired
    private SignInRepository repository;
	

	public SignIn signInAdd (@RequestBody SignIn request) {
		
		SignIn newUser = new SignIn();            
        
		newUser.setUsername(request.getUsername());
		newUser.setPassword(request.getPassword());             
		newUser.setNickname(request.getNickname());
		newUser.setEmail(request.getEmail());	
      
        repository.save(request);
        
        System.out.println(request.getUsername());
        System.out.println(request.getPassword());
        
        return newUser;     
}
}
