package com.example.microservice.service;

import java.util.List;

import com.example.microservice.entity.User;

public interface UserService {
	public User save(User user);
	public List<User> getUsers();
}
