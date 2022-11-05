package com.coding.daikichi;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class Daikichi {

	@RequestMapping("/travel/{name}")
	public String travel(@PathVariable("name")String myName) {
		return "congratulations! you will soon travel to " +myName;
	}
	@RequestMapping("/lotto/{number}")
	public String lotto(@PathVariable(required=false)Integer number) {
		if(number%2==0) {
		return "you will take a grand journey in the near future,but be wary of tempting offers";
	}
		else {
			return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
		}

}
	
}
