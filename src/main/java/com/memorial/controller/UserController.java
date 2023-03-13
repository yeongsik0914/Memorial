package com.memorial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.memorial.dto.UserCreateForm;
import com.memorial.service.UserService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
@RequestMapping("/user")
public class UserController {
	
	private final UserService userService;
	
	@GetMapping("/login")
	public String signup(UserCreateForm userCreateForm) { 
	
		return "login";
	}
	
	@PostMapping("/signup")
	public String signup(@Valid UserCreateForm userCreateForm, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			
			return "login";
		}
		
		userService.create(userCreateForm.getUsername(),
				userCreateForm.getEmail(), userCreateForm.getPassword());
		
		return "redirect:/";
	}
	
}
