package com.kaustubh.blog.service;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.kaustubh.blog.BlogPocApplication;
import com.kaustubh.blog.model.BlogPost;
import com.kaustubh.blog.model.User;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { BlogPocApplication.class, BlogPostService.class })
public class BlogPostServiceTest {

	@Autowired
	BlogPostService postService;

	@Test
	public void testPostSave() {

		User author = new User();
		author.setEmail("kaustubh0163@gmail.com");
		author.setFirstName("kaustubh");

		BlogPost post = new BlogPost();
		post.setContent("Hello world post");
		post.setTimeStamp(new Date());
		post.setTitle("Hello World");

		postService.savePost(author, post);

	}

}
