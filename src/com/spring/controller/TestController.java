package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.controller.command.Person;

@Controller
@RequestMapping("/testParent")
public class TestController {
	
	public TestController() {
		// TODO Auto-generated constructor stub
	}
	
	@RequestMapping("/test")
	public void test(@ModelAttribute("person") Person per){
		System.out.println("--------");
	}
}
