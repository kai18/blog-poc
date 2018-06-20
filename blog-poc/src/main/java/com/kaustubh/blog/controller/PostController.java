package com.kaustubh.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kaustubh.blog.model.BlogPost;
import com.kaustubh.blog.model.User;
import com.kaustubh.blog.service.BlogPostService;

@RestController
public class PostController {

	@Autowired
	BlogPostService postService;

	@PostMapping("/post")
	public void savePost(@RequestBody User user, @RequestBody BlogPost post) {
		postService.savePost(user, post);
	}

}
