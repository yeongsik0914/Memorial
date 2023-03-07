package com.memorial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class motionController {
	
	@GetMapping("/stop_motion") 
	public String getStopMotionPage() {
		return "stop_motion";
	}
}
