package com.avi.studentsPortal.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Trainer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	
	String name;
	
	@ElementCollection
	List<String> techKnown = new ArrayList<>();
	
	String picture;

	public Trainer(Long id, String name, List<String> techKnown, String picture) {
		super();
		this.id = id;
		this.name = name;
		this.techKnown = techKnown;
		this.picture = picture;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getTechKnown() {
		return techKnown;
	}

	public void setTechKnown(List<String> techKnown) {
		this.techKnown = techKnown;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	@Override
	public String toString() {
		return "Trainer [id=" + id + ", name=" + name + ", techKnown=" + techKnown + ", picture=" + picture + "]";
	}
	
	
	
	

}
