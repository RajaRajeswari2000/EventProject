package com.rajarajeswari.spring.boot.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rajarajeswari.spring.boot.entity.UserRegisterEntity;

public interface UserRegisterRepo extends JpaRepository<UserRegisterEntity, String> {

	List<UserRegisterEntity> findByEmailAndPassword(String email, String password);
	
	

}
