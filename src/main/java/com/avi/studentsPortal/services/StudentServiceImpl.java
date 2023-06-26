package com.avi.studentsPortal.services;

import java.util.List;

import com.avi.studentsPortal.model.FormData_Student;
import com.avi.studentsPortal.model.Student;

public interface StudentServiceImpl {
	
	public List<Student> getAllStudents();
	public Student addNewStudent(FormData_Student student);
	public boolean deleteStudentById(String id);
	public Student updateStudent(Student student);

}
