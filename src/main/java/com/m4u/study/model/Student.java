package com.m4u.study.model;

import java.util.Set;

public class Student {
	
	private Integer idStudent;
	private String name;
	private int age;
	private String email;
	private Set<User> users;
	private Set<Adress> adresses;
	
	public Student () {
	}
	
	public Student (String name, int age, String email, Set<User> users, Set<Adress> adresses) {
		this.setName(name);
		this.setAge(age);
		this.setEmail(email);
		this.setUsers(users);
		this.setAdresses(adresses);
		
	}
	
	public Integer getIdStudent() {
		return idStudent;
	}
	public void setIdStudent(Integer idStudent) {
		this.idStudent = idStudent;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Set<User> getUsers() {
		return users;
	}
	public void setUsers(Set<User> users) {
		this.users = users;
	}
	public Set<Adress> getAdresses() {
		return adresses;
	}
	public void setAdresses(Set<Adress> adresses) {
		this.adresses = adresses;
	}
	
	

}
