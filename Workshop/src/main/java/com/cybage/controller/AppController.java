package com.cybage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {
 
	
	@GetMapping(value = {"/", "/index"})
	public String welcome() {
		return "index";
	}
}
