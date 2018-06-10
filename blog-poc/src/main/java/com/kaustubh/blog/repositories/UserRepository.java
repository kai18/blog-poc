package com.kaustubh.blog.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.kaustubh.blog.model.User;

public interface UserRepository extends Neo4jRepository<User, String> {

	public User findByEmail(String email);

}
