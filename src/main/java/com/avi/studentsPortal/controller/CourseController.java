package com.avi.studentsPortal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.avi.studentsPortal.model.Course;
import com.avi.studentsPortal.services.CourseService;

@RestController
@RequestMapping("/course")
public class CourseController {
	
	@Autowired
	CourseService _courseService;
	
	@PostMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Course> addCourse(@RequestBody Course course){
		try {
			Course courseTemp = this._courseService.addCourse(course);
			
			if(courseTemp != null) {
				return ResponseEntity.status(HttpStatus.CREATED).body(courseTemp);
			}
			else return ResponseEntity.status(HttpStatus.CONFLICT).body(null);
			}
		catch(Exception e) {
			System.out.println(e);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
		}
	}

}
