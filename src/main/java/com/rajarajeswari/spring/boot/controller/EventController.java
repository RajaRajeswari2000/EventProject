package com.rajarajeswari.spring.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rajarajeswari.spring.boot.entity.EventEntity;
import com.rajarajeswari.spring.boot.service.EventService;

@Controller
public class EventController {
	
	@Autowired
	EventService service;
	
	@RequestMapping("event")
	public String events() {
		return "createevent";
	}
	
	@RequestMapping ("eventdetails")
	public String saveEventDetails(@ModelAttribute EventEntity events) {
		service.Create(events);
		return "back";
	}
	
}


