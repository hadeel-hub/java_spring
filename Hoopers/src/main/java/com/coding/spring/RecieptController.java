package com.coding.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RecieptController {
	// class definition and imports here...
    @RequestMapping("/")
    public String index(Model model) {
        
        String name = "Grace Hopper";
        String itemName = "Copper wire";
        double price = 5.25;
        String description = "Metal strips, also an illustration of nanoseconds.";
        String vendor = "Little Things Corner Store";
    
    	// Your code here! Add values to the view model to be rendered
        model.addAttribute("n",name);
        model.addAttribute("item",itemName);
        model.addAttribute("money",price);
        model.addAttribute("desc",description);
        model.addAttribute("v",vendor);
    
        return "index.jsp";
    }
    //...
    


}
