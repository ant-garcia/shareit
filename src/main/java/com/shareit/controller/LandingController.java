package com.shareit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LandingController{

	@RequestMapping("/")
	public String landing(){
		return "landing";
	}
}