package com.memorial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class loginController {
	@GetMapping("login")
	public String login() {
		return "login";
	}
	
//	@GetMapping("/stop_motion") 
//	public String getStopMotionPage() {
//		return "stop_motion";
//	}
}
