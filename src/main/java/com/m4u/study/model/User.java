package com.m4u.study.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idUser")
	private Integer idUser;
	
	@Column(name = "users", length = 40, nullable = false)
	private String users;
	
	@Column(name = "password", length = 20, nullable = false)
	private String password;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "tbl_student", referencedColumnName = "idStudent", nullable = false)
	private Student idStudent;


//=================
//Construtores da classe
	
public User() {
	
}

public User(Integer idUser, String users, String password, Student idStudent) {
	
	this.idUser = idUser;
	this.users = users;
	this.password = password;
	this.idStudent = idStudent;
	
	}


//==================
//Getters and Setters

public Integer getIdUser() {
	return idUser;
}

public void setIdUser(Integer idUser) {
	this.idUser = idUser;
}

public String getUsers() {
	return users;
}

public void setUsers(String users) {
	this.users = users;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public Student getIdStudent() {
	return idStudent;
}

public void setIdStudent(Student idStudent) {
	this.idStudent = idStudent;
}

//==============
//toString
@Override
	public String toString() {
		return "User [idUser=" + idUser + ", users=" + users
				+ ", password=" + password + ", idStudent=" + idStudent + "]";
	}


}