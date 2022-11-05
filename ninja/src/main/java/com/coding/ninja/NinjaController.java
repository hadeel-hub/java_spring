package com.coding.ninja;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NinjaController {
@RequestMapping("/")
public String index() {
	return "show.jsp";
}
@RequestMapping("/log")
public String log() {
	return "redirect:/";
}

}
