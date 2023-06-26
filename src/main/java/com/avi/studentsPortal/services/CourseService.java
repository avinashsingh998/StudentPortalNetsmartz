package com.avi.studentsPortal.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avi.studentsPortal.model.Course;
import com.avi.studentsPortal.repo.CourseDao;


@Service
public class CourseService implements courseServiceImpl{

	@Autowired
	CourseDao _courseDao;
	
	
	@Override
	public Course addCourse(Course course) {
		try {

			return this._courseDao.save(course);
		}catch(Exception e) {
			System.out.println(e);
			return null;
		}
	}

	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Course getCourseById(Long id) {
		try {

			return this._courseDao.findById(id).get();
		}catch(Exception e) {
			System.out.println(e);
			return null;
		}
	}

}
