package com.avi.studentsPortal.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.avi.studentsPortal.model.Student;
import com.avi.studentsPortal.model.Account;
import com.avi.studentsPortal.model.FormData_Student;
import com.avi.studentsPortal.model.Qualification;
import com.avi.studentsPortal.model.QualificationForm;
import com.avi.studentsPortal.services.StudentService;



@RestController
@RequestMapping("/student")
public class studentController {
	
	@Autowired
	StudentService _studentService;
	
	@GetMapping("/")
	public ResponseEntity<List<Student>> getAllStudent(){
		System.out.println("called");
		try {
			List<Student> students = this._studentService.getAllStudents();
			System.out.println(students);
			if(students.size()==0) {
				System.out.println("If called");
				 return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
			}
			else {
				System.out.println("Else called ");
				return ResponseEntity.status(HttpStatus.OK).body(students);
			}
		}
		catch(Exception err) {
			System.out.println(err);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
		}
	}
	
	
	@PostMapping(value = "/", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Student> addStudent(@RequestBody FormData_Student formData){
		
		try {
			Student std = this._studentService.addNewStudent(formData);
			if(std != null) return ResponseEntity.status(HttpStatus.CREATED).body(std);
			
			else return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
			
		}
		catch(Exception e) {
			System.out.println("Controller layer ........"+e);
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null); 
		}
		
	}


	

}
