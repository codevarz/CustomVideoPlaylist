package com.myvideos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//import java.util.Date;

@Entity
@Table(name="user")
public class User {

	@Id
	@Column(name="user_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userid;
	@Column(name="name")
	private String name;
	@Column(name="email")
	private String email;
	@Column(name="dob")
	private String dob;
	@Column(name="username")
	private String username;
	@Column(name="password")
	private String password;
	
	public User(){
		
	}

	public User(String name, String email, String dob, String username, String password) {
		super();
		//this.userid = userid;
		this.name = name;
		this.email = email;
		this.dob = dob;
		this.username = username;
		this.password = password;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
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

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return String.format("User [userid=%s, name=%s, email=%s, dob=%s, username=%s, password=%s]", userid, name,
				email, dob, username, password);
	}
	
	
	
}
