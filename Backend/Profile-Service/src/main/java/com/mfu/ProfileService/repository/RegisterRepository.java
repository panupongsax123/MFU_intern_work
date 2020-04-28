package com.mfu.ProfileService.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mfu.ProfileService.model.Register;

public interface RegisterRepository extends JpaRepository <Register, Integer> {
	
	List<Register>findAll();
}
