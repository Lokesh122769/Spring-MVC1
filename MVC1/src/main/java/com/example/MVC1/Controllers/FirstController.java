package com.example.MVC1.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController
{

	@RequestMapping("/welcome")
	public ModelAndView display()
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("message", "Hello ! welcome to my first project");
		mv.setViewName("demo"); 
		
		return mv;
	}
	
	@GetMapping("/welcome")
	public String display(Model m)
	{
		System.out.println("Implementing class of Model interface is"+m.getClass().getName());
		m.addAttribute("message", "Hella all am java enthusiast");
	
		return "demo";
	}
	
}
