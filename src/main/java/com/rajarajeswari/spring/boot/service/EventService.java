package com.rajarajeswari.spring.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rajarajeswari.spring.boot.entity.EventEntity;
import com.rajarajeswari.spring.boot.repo.EventRepo;

@Service
public class EventService {
	
	@Autowired
	EventRepo repo;
	
	public void Create(EventEntity events) {
		repo.save(events);
	}
	
	public List<EventEntity> get(){
		return null;
	}

}
