package com.coding.firstproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class HomeController {
	@RequestMapping("")
	public String hello() {
		return "welcome";
	}
	@RequestMapping("/today")
	public String wishluck() {
		return "Today you will find luck";
		
	}
	@RequestMapping("/tomorrow")
	public String tomorrow() {
		return "Tomorrow, an oppurtunity will arise";
		
	}
}
