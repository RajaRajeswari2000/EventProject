package com.rajarajeswari.spring.boot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rajarajeswari.spring.boot.entity.UserRegisterEntity;
import com.rajarajeswari.spring.boot.repo.UserRegisterRepo;

@Service
public class UserRegisterService {

	@Autowired
	UserRegisterRepo repo;

	public void savedetails(UserRegisterEntity userdetails) {
		repo.save(userdetails);

	}

	public List<UserRegisterEntity> details(String email, String password) {
		List<UserRegisterEntity> details = repo.findByEmailAndPassword(email, password);
		if (details.size() == 0) {
			return null;
		} else {
			return details;
		}
	}

	public List<UserRegisterEntity> getall() {
		List<UserRegisterEntity> details=repo.findAll();
		if (details.size() == 0) {
			return null;
		} else {
			return details;
		}
		
	}

}
