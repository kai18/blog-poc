package com.kaustubh.blog.model;

public enum UserRole {

	ADMIN("Admin"), AUTHOR("Author"), EDITOR("Editor"), CONTRIBUTOR("Contributor"), SUBSCRIBER("Subscriber");

	private String roleValue;

	private UserRole(String roleValue) {
		this.roleValue = roleValue;

	}

}
