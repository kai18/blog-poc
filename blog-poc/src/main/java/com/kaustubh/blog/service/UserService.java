package com.kaustubh.blog.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.kaustubh.blog.model.User;
import com.kaustubh.blog.repositories.UserRepository;

public class UserService {

	@Autowired
	UserRepository userRepository;

	public User getUser(String email) {
		return userRepository.findByEmail(email);
	}

	public User saveUser(User user) {
		return userRepository.save(user);
	}

}
