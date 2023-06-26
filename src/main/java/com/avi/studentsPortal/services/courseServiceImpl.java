package com.avi.studentsPortal.services;

import java.util.List;

import com.avi.studentsPortal.model.Course;

public interface courseServiceImpl {
	
	public Course addCourse(Course course);
	public List<Course> getCourses();
	public Course getCourseById(Long id);

}
