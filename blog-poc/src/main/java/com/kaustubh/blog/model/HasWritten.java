package com.kaustubh.blog.model;

import java.util.Date;

import org.neo4j.ogm.annotation.EndNode;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.RelationshipEntity;
import org.neo4j.ogm.annotation.StartNode;

import com.kaustubh.blog.core.model.IModel;

@RelationshipEntity(type = "HAS_WRITTEN")
public class HasWritten implements IModel {

	private static final long serialVersionUID = 7745566379321767335L;
	@Id
	@GeneratedValue
	Long id;
	@StartNode
	private User author;
	@EndNode
	private BlogPost post;

	private Date timestamp;
	private String status;

	public HasWritten() {
	}

	public HasWritten(User author, BlogPost post, Date timestamp, String status) {
		super();
		this.author = author;
		this.post = post;
		this.timestamp = timestamp;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}

	public BlogPost getPost() {
		return post;
	}

	public void setPost(BlogPost post) {
		this.post = post;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
