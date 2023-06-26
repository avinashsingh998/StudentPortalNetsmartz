package com.avi.studentsPortal.model;

import java.time.LocalDate;
import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Qualification {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	
	String courseName;
	
	LocalDate startingDate;
	LocalDate endDate;
	
	String duration;
	
	@Column(nullable = true)
	float cgpaScore;
	
	@Column(nullable = true)
	float percentageScore;
	
	String institute;
	
	

	public Qualification() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Qualification(long id, String courseName, LocalDate startingDate, LocalDate endDate, String duration,
			float cgpaScore, float percentageScore, String institute) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.startingDate = startingDate;
		this.endDate = endDate;
		this.duration = duration;
		this.cgpaScore = cgpaScore;
		this.percentageScore = percentageScore;
		this.institute = institute;
	}
	
	public Qualification(QualificationForm form) {
		int[] start = Arrays.stream(form.startingDate.split("-"))
		        .mapToInt(Integer::parseInt)
		        .toArray();
		int[] end = Arrays.stream(form.endDate.split("-"))
		        .mapToInt(Integer::parseInt)
		        .toArray();
		
		
		this.courseName = form.courseName;
		this.startingDate = LocalDate.of(start[0],start[1], start[2]);
		this.endDate = LocalDate.of(end[0],end[1], end[2]);
		
		this.cgpaScore = form.cgpaScore;
		this.percentageScore = form.percentageScore;
		this.institute = form.institute;
		this.duration = form.duration;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public LocalDate getStartingDate() {
		return startingDate;
	}

	public void setStartingDate(LocalDate startingDate) {
		this.startingDate = startingDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public float getCgpaScore() {
		return cgpaScore;
	}

	public void setCgpaScore(float cgpaScore) {
		this.cgpaScore = cgpaScore;
	}

	public float getPercentageScore() {
		return percentageScore;
	}

	public void setPercentageScore(float percentageScore) {
		this.percentageScore = percentageScore;
	}

	public String getInstitute() {
		return institute;
	}

	public void setInstitute(String institute) {
		this.institute = institute;
	}

	@Override
	public String toString() {
		return "Qualification [id=" + id + ", courseName=" + courseName + ", startingDate=" + startingDate
				+ ", endDate=" + endDate + ", duration=" + duration + ", cgpaScore=" + cgpaScore + ", percentageScore="
				+ percentageScore + ", institute=" + institute + "]";
	}
	
	

}
