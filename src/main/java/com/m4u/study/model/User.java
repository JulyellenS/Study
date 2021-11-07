package com.m4u.study.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
@Table(name = "tbl_users")
public class User implements UserDetails {

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idUser")
	private Long idUser;

	@Column(name = "users", length = 40, nullable = false)
	private String users;

	@Column(name = "password", length = 20, nullable = false)
	private String password;
	
	@ManyToMany(fetch = FetchType.EAGER)
	private List<Perfil> perfis = new ArrayList<>();

	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "tbl_student", referencedColumnName = "idStudent", nullable = false)
	private Student idStudent;

//=================
//Construtores da classe

	public User() {

	}

	public User(Long idUser, String users, String password, Student idStudent) {

		this.idUser = idUser;
		this.users = users;
		this.password = password;
		this.idStudent = idStudent;

	}

//==================
//Getters and Setters

	public Long getIdUser() {
		return idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	public String getUsers() {
		return users;
	}

	public void setUsers(String users) {
		this.users = users;
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
		return "User [idUser=" + idUser + ", users=" + users + ", password=" + password + ", idStudent=" + idStudent
				+ "]";
	}
	
	// Métodos de detalhes do users

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return this.perfis;
	}
	
	@Override
	public String getPassword() {
		return this.password;
	}

	@Override
	public String getUsername() {
		return this.users;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}