package com.Cathy.hw;

import java.util.Comparator;

public class User implements Comparator<User> {

	private String name;
	private String email;
	private Long date;

	public User() {

	}

	public User(String name, String email, Long date) {
		this.name = name;
		this.email = email;
		this.date = date;
	}
	
	@Override
	public int compare(User u1, User u2) {
		return u1.getName().compareTo(u2.getName());
	}

	@Override
	public String toString() {
		return String.format("%n Name : %s %n Email : %s %n Date : %s %n", name, email, date);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getDate() {
		return date;
	}

	public void setDate(Long date) {
		this.date = date;
	}


}