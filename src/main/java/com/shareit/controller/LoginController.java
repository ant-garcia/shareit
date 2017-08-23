package com.shareit.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.shareit.dto.LoginDto;
import com.shareit.model.User;
import com.shareit.service.UserService;

@Controller
@RequestMapping("/login")
public class LoginController {

	@Autowired
	UserService userService;
	
	@RequestMapping(method = RequestMethod.GET)
	public String get(Map<String, Object> model){
		model.put("loginDto", new LoginDto());
		
		return "login";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String login(@ModelAttribute("loginDto") LoginDto loginDto,
			BindingResult bindingResult, Map<String, Object> model, HttpSession session){
		if(bindingResult.hasErrors()){
			bindingResult.getAllErrors().stream().forEach(System.out::println);
			String error = "An unexpected error has occured";
			model.put("message", true);
			model.put("value", error);
			return "login";
		}
		
		User user = userService.getByUsername(loginDto.getUsername());
		
		if(user == null){
			String error = "Username is not valid";
			model.put("message", true);
			model.put("value", error);
			return "login";
		}
		
		if(!user.getPassword().equals(loginDto.getPassword())){
			String error = "Incorrect Username or Password";
			model.put("message", true);
			model.put("value", error);
			return "login";
		}
		
		session.setAttribute("username", user.getUsername());
		
		return "redirect:/profile";
	}
}