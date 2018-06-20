package com.kaustubh.blog.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.kaustubh.blog.model.AuthorToPostRelationship;

public interface HasWrittenRepository extends Neo4jRepository<AuthorToPostRelationship, Long> {

}
