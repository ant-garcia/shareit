package com.shareit.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.shareit.dto.SignupDto;
import com.shareit.model.User;
import com.shareit.service.UserService;

@Controller
@RequestMapping("/signup")
public class SignupController {

	@Autowired
	UserService userService;
	
	@RequestMapping(method = RequestMethod.GET)
	public String get(Map<String,Object> model){
		model.put("signupDto", new SignupDto());
		
		return "signup";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String signup(@ModelAttribute("signupDto") SignupDto signupDto,
			BindingResult bindingResult, Map<String, Object> model, HttpSession session){
		if(bindingResult.hasErrors()){
			bindingResult.getAllErrors().stream().forEach(System.out::println);
			String error = "An unexpected error has occured";
			model.put("message", true);
			model.put("value", error);
			return "signup";
		}
		
		if(!signupDto.getPassword().equals(signupDto.getConfirmPassword())){
			String error = "Passwords do not match";
			model.put("message", true);
			model.put("value", error);
			return "signup";
		}
		
		User user = userService.getByUsername(signupDto.getUsername());

		if(user != null){
			String error = "This username is already in use";
			model.put("message", true);
			model.put("value", error);
			return "signup";
		}
		
		user = new User(signupDto.getUsername(), signupDto.getEmail(), signupDto.getPassword(),
				signupDto.getFirstName(), signupDto.getLastName());
	
		userService.add(user);
		session.setAttribute("username", user.getUsername());
		
		return "redirect:/profile";
	}
}