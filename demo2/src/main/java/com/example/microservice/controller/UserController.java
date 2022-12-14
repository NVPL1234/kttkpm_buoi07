package com.example.microservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.microservice.entity.User;
import com.example.microservice.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/users")
	public User save(@RequestBody User user) {
		return userService.save(user);
	}
	
	@GetMapping("/users")
	public List<User> getUsers() {
		return userService.getUsers();
	}
	
}
