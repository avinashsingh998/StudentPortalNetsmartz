package com.avi.studentsPortal.model;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.MapKeyColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;


@Entity
public class Student {

	@Id
	String id;
	
	@Column(nullable = false)
	String name;
	
	@Column(nullable = false)
	String email;
	
	
	String picture;
	
	LocalDate dob;
	
	Long aadharNumber;
	
	@OneToOne(fetch=FetchType.EAGER, cascade = CascadeType.ALL)
	Account bankAcc = new Account();
	
	String address;
	
	String gender;
	
	String phoneNumber;
	
	@ElementCollection
    @CollectionTable(name = "student_attendance", joinColumns = @JoinColumn(name = "student_id"))
    @MapKeyColumn(name = "attendance_date")
    @Column(name = "is_present")
	Map<LocalDate, String> attendence = new HashMap<>();
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	List<Qualification> qualifications = new LinkedList<>();
		
	
	@ManyToMany(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
	private List<Course> courses = new LinkedList<>();


	public Student() {
		super();
	}


	public Student(String id, String name, String email, String picture, LocalDate dob, Long aadharNumber,
			Account bankAcc, String address, String gender, String phoneNumber, Map<LocalDate, String> attendence,
			List<Qualification> qualifications, List<Course> courses) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.picture = picture;
		this.dob = dob;
		this.aadharNumber = aadharNumber;
		this.bankAcc = bankAcc;
		this.address = address;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
		this.attendence = attendence;
		this.qualifications = qualifications;
		this.courses = courses;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
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


	public String getPicture() {
		return picture;
	}


	public void setPicture(String picture) {
		this.picture = picture;
	}


	public LocalDate getDob() {
		return dob;
	}


	public void setDob(LocalDate dob) {
		this.dob = dob;
	}


	public Long getAadharNumber() {
		return aadharNumber;
	}


	public void setAadharNumber(Long aadharNumber) {
		this.aadharNumber = aadharNumber;
	}


	public Account getBankAcc() {
		return bankAcc;
	}


	public void setBankAcc(Account bankAcc) {
		this.bankAcc = bankAcc;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public Map<LocalDate, String> getAttendence() {
		return attendence;
	}


	public void setAttendence(Map<LocalDate, String> attendence) {
		this.attendence = attendence;
	}


	public List<Qualification> getQualifications() {
		return qualifications;
	}


	public void setQualifications(List<Qualification> qualifications) {
		this.qualifications = qualifications;
	}


	public List<Course> getCourses() {
		return courses;
	}


	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", picture=" + picture + ", dob=" + dob
				+ ", aadharNumber=" + aadharNumber + ", bankAcc=" + bankAcc + ", address=" + address + ", gender="
				+ gender + ", phoneNumber=" + phoneNumber + ", attendence=" + attendence + ", qualifications="
				+ qualifications + ", courses=" + courses + "]";
	}


		
	
	
	
}
