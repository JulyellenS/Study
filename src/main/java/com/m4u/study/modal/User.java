package com.m4u.study.modal;

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
@Table(name = "tbl_user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idUser")
	private Integer idUser;
	
	@Column(name = "user", length = 40, nullable = false)
	private String user;
	
	@Column(name = "user", length = 20, nullable = false)
	private String password;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "tbl_student", referencedColumnName = "idStudent", nullable = false)
	private Integer idStudent;

}
