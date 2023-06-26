package com.avi.studentsPortal.model;

public class QualificationForm {
	
	String courseName;
	
	String startingDate;
	String endDate;
	String duration;
	float cgpaScore;
	float percentageScore;
	String institute;
	
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getStartingDate() {
		return startingDate;
	}
	public void setStartingDate(String startingDate) {
		this.startingDate = startingDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
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
		return "QualificationForm [courseName=" + courseName + ", startingDate=" + startingDate + ", endDate=" + endDate
				+ ", duration=" + duration + ", cgpaScore=" + cgpaScore + ", percentageScore=" + percentageScore
				+ ", institute=" + institute + "]";
	}
	
	

}
