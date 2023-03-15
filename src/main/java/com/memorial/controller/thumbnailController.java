package com.memorial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class thumbnailController {
	
	@GetMapping("/thumbnail")
	public String getThumbnailPage() {
		return "thumbnail";
	}
}
