package com.m4u.study.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tbl_student")
public class Student {
	
	@Id
	@Column(name = "idStudent")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idStudent;
	
	@Column(name = "nameStudent", length = 35, nullable = false)
	private String name;
	
	@Column(name = "ageStudent", length = 10, nullable = false)
	private int age;
	
	@Column(name = "emailStudent", length = 35, nullable = false)
	private String email;
	
	@OneToMany(fetch = FetchType.EAGER)
	private Set<User> users;
	
	@OneToMany(fetch = FetchType.EAGER)
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
