package com.kaustubh.blog.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kaustubh.blog.model.User;
import com.kaustubh.blog.service.UserService;

@RestController
@RequestMapping("/user/")
public class UserController {

	@Autowired
	UserService userService;

	Logger LOGGER = LoggerFactory.getLogger(this.getClass());

	@PostMapping("register")
	public void saveUser(@RequestBody User user) {
		userService.saveUser(user);
	}

	@GetMapping("/user/{email}")
	public User getUser(@PathVariable(value = "email") String email) {
		LOGGER.info("Requesting user with email {}", email);
		return userService.getUser(email);
	}

}
