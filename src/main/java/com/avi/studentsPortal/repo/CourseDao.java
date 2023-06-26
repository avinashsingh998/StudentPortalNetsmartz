package com.avi.studentsPortal.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.avi.studentsPortal.model.Course;

public interface CourseDao extends JpaRepository<Course, Long> {

}
