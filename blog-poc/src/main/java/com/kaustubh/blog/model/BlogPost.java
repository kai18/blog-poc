package com.kaustubh.blog.model;

import java.util.Date;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

import com.kaustubh.blog.core.model.IModel;

@NodeEntity
public class BlogPost implements IModel {

	private static final long serialVersionUID = -3850785306705141779L;

	@Id
	@GeneratedValue
	Long id;

	private String title;
	private String content;
	private Date timeStamp;

	User author;

	public BlogPost(Long id, String title, String content, Date timeStamp, User author) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.timeStamp = timeStamp;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
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

}
