package com.avi.studentsPortal.model;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Course {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	Long id;
	
	@Column(nullable = false)
	String courseName;
	
	Double courseFee;
	
	String duration;
	
	int totalSeat;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.DETACH)
	private List<Student> students = new LinkedList<>();
	
	

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(Long id, String courseName, Double courseFee, String duration, int totalSeat,
			List<Student> students) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.courseFee = courseFee;
		this.duration = duration;
		this.totalSeat = totalSeat;
		this.students = students;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Double getCourseFee() {
		return courseFee;
	}

	public void setCourseFee(Double courseFee) {
		this.courseFee = courseFee;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public int getTotalSeat() {
		return totalSeat;
	}

	public void setTotalSeat(int totalSeat) {
		this.totalSeat = totalSeat;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", courseName=" + courseName + ", courseFee=" + courseFee + ", duration=" + duration
				+ ", totalSeat=" + totalSeat + ", students=" + students + "]";
	}
	
	
	
	
	

}
