package com.coding.spring;

import java.sql.Date;
import java.text.SimpleDateFormat;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class DisplayController {
@RequestMapping("/")
public String index() {
	return "date.jsp";
}
@RequestMapping("/date")
public String show(Model model) {
	String datePattern = "EEEEE, dd MMMMM, yyyy";
	SimpleDateFormat dateFormat = new SimpleDateFormat(datePattern);
	String date = dateFormat.format(new Date(System.currentTimeMillis()));	
	model.addAttribute("date", date);
	return "show.jsp";
}
@RequestMapping("/time")
public String time(Model model){
	String timePattern = "hh:mm a";
	SimpleDateFormat timeFormat = new SimpleDateFormat(timePattern);
	String date = timeFormat.format(new Date(System.currentTimeMillis()));	
	model.addAttribute("date", date);
	return "time.jsp";
}
}
