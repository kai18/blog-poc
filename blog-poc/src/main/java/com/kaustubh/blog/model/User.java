package com.kaustubh.blog.model;

import java.util.List;
import java.util.Set;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.Labels;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import com.kaustubh.blog.core.model.IModel;

@NodeEntity
public class User implements IModel {

	private static final long serialVersionUID = -1195251397480255288L;

	@Id
	@GeneratedValue
	Long id;

	@Labels
	List<String> labels;
	String firstName;
	String lastName;
	String email;
	String password;

	@Relationship(type = "HAS_WRITTEN", direction = Relationship.OUTGOING)
	private Set<BlogPost> posts;

	public User() {
	}

	public User(Long id, String firstName, String lastName, String email) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<BlogPost> getPosts() {
		return posts;
	}

	public void setPosts(Set<BlogPost> posts) {
		this.posts = posts;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", posts=" + posts + "]";
	}

}
