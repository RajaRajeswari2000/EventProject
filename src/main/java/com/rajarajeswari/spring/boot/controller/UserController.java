package com.rajarajeswari.spring.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.rajarajeswari.spring.boot.entity.UserRegisterEntity;
import com.rajarajeswari.spring.boot.service.UserRegisterService;

@Controller
public class UserController {

	@Autowired
	UserRegisterService service;

	@RequestMapping("/")
	public String homepage() {
		return "home";
	}
	
	@RequestMapping("login")
	public String loginPage() {
		return "login";
	}

	@RequestMapping("/register")
	public String register() {
		return "register";
	}
	
	@RequestMapping("/logout")
	public String logout() {
		return "home";
	}
	
	@RequestMapping("/createEvent")
	public String createEvent() {
		return "login";
	}
	
	@RequestMapping("/about")
	public String about() {
		return "about";
	}

	@PostMapping("member-accout")
	public ModelAndView login(@RequestParam String email, @RequestParam String password) {
		ModelAndView m = new ModelAndView();
		List<UserRegisterEntity> entity = service.details(email, password);
		m.setViewName("profile");
		if (entity == null) {
			m.setViewName("login");
			String reply = "email id and password couldn't match";
			m.addObject("reply", reply);
		} else {
			for (UserRegisterEntity ent : entity) {// we have to use also ===enhanced for loop for(int number:number){
				m.addObject("details", ent);
			}
		}
		return m;
	}
	@RequestMapping(value = "userdetails", method = RequestMethod.POST)
	public String userdetails(@ModelAttribute UserRegisterEntity userdetails) {
		service.savedetails(userdetails);
		return "login";
	}

	
	/*
	 * @GetMapping("getdetails/{email}/{password}") public ModelAndView
	 * login(@PathVariable("email") String email, @PathVariable("password") String
	 * password) { ModelAndView m = new ModelAndView(); List<UserRegisterEntity>
	 * entity = service.details(email, password); m.setViewName("home"); if (entity
	 * == null) { m.setViewName("welcome"); String reply =
	 * "email id and password couldn't match"; m.addObject("reply", reply); } else {
	 * for (UserRegisterEntity ent : entity) {// we have to use also ===enhanced for
	 * loop for(int number:number){ m.addObject("details", ent); } } return m; }
	 */
}
