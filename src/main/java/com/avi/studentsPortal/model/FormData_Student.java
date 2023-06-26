package com.avi.studentsPortal.model;

import java.util.Arrays;

public class FormData_Student {
	
	String id;
	String name;
	String email;
	String picture;
	String dob;
	long aadharNumber;
	Account account;
	String address;
	String gender;
	String phoneNumber;
	Long[] courseId;	
	QualificationForm[] qualifications;
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
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public long getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(long aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
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
	public Long[] getCourseId() {
		return courseId;
	}
	public void setCourseId(Long[] courseId) {
		this.courseId = courseId;
	}
	public QualificationForm[] getQualifications() {
		return qualifications;
	}
	public void setQualifications(QualificationForm[] qualifications) {
		this.qualifications = qualifications;
	}
	@Override
	public String toString() {
		return "FormData_Student [id=" + id + ", name=" + name + ", email=" + email + ", picture=" + picture + ", dob="
				+ dob + ", aadharNumber=" + aadharNumber + ", account=" + account + ", address=" + address + ", gender="
				+ gender + ", phoneNumber=" + phoneNumber + ", courseId=" + Arrays.toString(courseId)
				+ ", qualifications=" + Arrays.toString(qualifications) + "]";
	}
	
	
	
	
	
	
	
	
	
	


	
	
	

}
