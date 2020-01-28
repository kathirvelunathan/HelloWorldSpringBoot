package com.kathir.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AppController {
	
	@RequestMapping(method = RequestMethod.GET, produces = {"application/json"})
	public @ResponseBody String helloWorld() {
		
		return "Hello World!!!"; 
	}
}
