package com.kaustubh.blog.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

import com.kaustubh.blog.BlogPocApplication;
import com.kaustubh.blog.model.User;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { BlogPocApplication.class, UserService.class })
@ComponentScan
public class UserServiceTest {

	@Autowired
	UserService userService;

	@Test
	public void testWithEmailId() {
		assertThat(userService.getUser("lol")).isNotNull();
	}

	@Test
	public void testForRelationship() {
		User user = userService.getUser("lol12");
		assertThat(user.getPosts()).isNotNull();
		assertThat(user.getPosts()).isNotEmpty();

	}

}
