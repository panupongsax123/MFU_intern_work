package com.mfu.MFU_intern_work.signInRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mfu.MFU_intern_work.model_signIn.SignIn;

public interface SignInRepository extends JpaRepository <SignIn, String> {

}
