package com.kaustubh.blog.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.kaustubh.blog.model.BlogPost;

public interface BlogPostRepository extends Neo4jRepository<BlogPost, Long> {

}
