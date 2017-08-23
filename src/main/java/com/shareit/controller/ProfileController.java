package com.shareit.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.shareit.model.User;
import com.shareit.service.UserService;

@Controller
@RequestMapping("/profile")
public class ProfileController {

	@Autowired
	UserService userService;
	
	@RequestMapping(method = RequestMethod.GET)
	public String get(Map<String, Object> model, HttpSession session){
		
		String username = (String) session.getAttribute("username");
		User user = userService.getByUsername(username);
		
		return "profile";
	}
}
