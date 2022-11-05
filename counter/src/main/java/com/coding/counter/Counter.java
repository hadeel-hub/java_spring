package com.coding.counter;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Counter {
	private int counter = 0;
@RequestMapping("/")
public String adding(HttpSession session) {
		session.setAttribute("count",counter++);
	return "index.jsp";
}

@RequestMapping("/show")
public String showing(HttpSession session,Model model) {
	Integer currentCount =(Integer)(session.getAttribute("count"));
	model.addAttribute("countToShow", currentCount);
	
	return "show.jsp";
}

}
