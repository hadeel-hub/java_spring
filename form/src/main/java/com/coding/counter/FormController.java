package com.coding.counter;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {
@RequestMapping("/")
public String dash() {
	return "dash.jsp";
}
@PostMapping("/log")
public String log(@RequestParam(value="city")String city,@RequestParam(value="living")String living,
		@RequestParam(value="person")String person,@RequestParam(value="hoppy")String hoppy,
		@RequestParam(value="desc")String desc,HttpSession session) {
	session.setAttribute("desc", desc);session.setAttribute("person", person);
	session.setAttribute("city", city);
	session.setAttribute("living", living);
	session.setAttribute("hoppy", hoppy);
	
	return "log.jsp";
}

}
