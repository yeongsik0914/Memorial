package com.memorial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class filmController {
	
	@GetMapping("/film")
	public String getFilmPage() {
		return "film";
	}
}
