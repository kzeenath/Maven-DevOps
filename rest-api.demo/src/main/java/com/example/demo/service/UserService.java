package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.User;

public interface UserService {

	public void addUser(User user);
	public List<User> getAlluser();
	public Optional<User> getUserById(int userId);
	public List<User> getUserByName(String name);
	}