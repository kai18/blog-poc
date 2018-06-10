package com.kaustubh.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

@SpringBootApplication
@EnableNeo4jRepositories
@Configuration
public class BlogPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogPocApplication.class, args);
	}

}
