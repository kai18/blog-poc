package com.kaustubh.blog.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kaustubh.blog.model.BlogPost;
import com.kaustubh.blog.model.AuthorToPostRelationship;
import com.kaustubh.blog.model.User;
import com.kaustubh.blog.repositories.BlogPostRepository;
import com.kaustubh.blog.repositories.HasWrittenRepository;

@Service
public class BlogPostService {

	@Autowired
	BlogPostRepository postRepository;

	@Autowired
	HasWrittenRepository hasWrittenRepository;

	public BlogPost savePost(User user, BlogPost post) {

		AuthorToPostRelationship hasWritten = new AuthorToPostRelationship();
		hasWritten.setAuthor(user);
		hasWritten.setPost(post);
		hasWritten.setTimestamp(new Date());

		return hasWrittenRepository.save(hasWritten).getPost();
	}
}
