package com.avi.studentsPortal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admin {
	
	@Id
	String admin_Id;
	
	@Column(nullable = false)
	String name;
	
	String desigantion;
	
	@Column(nullable = false)
	private String password;

	String email;

	public Admin(String admin_Id, String name, String desigantion, String password, String email) {
		super();
		this.admin_Id = admin_Id;
		this.name = name;
		this.desigantion = desigantion;
		this.password = password;
		this.email = email;
	}

	public String getAdmin_Id() {
		return admin_Id;
	}

	public void setAdmin_Id(String admin_Id) {
		this.admin_Id = admin_Id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesigantion() {
		return desigantion;
	}

	public void setDesigantion(String desigantion) {
		this.desigantion = desigantion;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Admin [admin_Id=" + admin_Id + ", name=" + name + ", desigantion=" + desigantion + ", password="
				+ password + ", email=" + email + "]";
	}
	
	
	
	
}
