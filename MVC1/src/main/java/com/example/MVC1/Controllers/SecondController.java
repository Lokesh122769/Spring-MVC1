package com.example.MVC1.Controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecondController
{
    @RequestMapping("/getStatus")
    public String getStatus(Map<String,Object> m)
    {
    	System.out.println("Implementing class of MAP is "+m.getClass().getName());
    	m.put("key", "This is map class");
    	
    	return "status";
    }
}
