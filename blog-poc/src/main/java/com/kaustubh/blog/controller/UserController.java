package com.kaustubh.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

import com.kaustubh.blog.model.User;
import com.kaustubh.blog.service.UserService;

public class UserController {

	@Autowired
	UserService userService;

	@PostMapping
	public void saveUser(User user) {

	}

}
