package com.avi.studentsPortal.services;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avi.studentsPortal.model.Account;
import com.avi.studentsPortal.model.Course;
import com.avi.studentsPortal.model.FormData_Student;
import com.avi.studentsPortal.model.Qualification;
import com.avi.studentsPortal.model.QualificationForm;
import com.avi.studentsPortal.model.Student;
import com.avi.studentsPortal.repo.StudentDao;


@Service
public class StudentService implements StudentServiceImpl{

	
	@Autowired
	StudentDao studentDao;
	
	
	
	@Autowired
	CourseService _courseService;
	
	@Override
	public List<Student> getAllStudents() {
		return this.studentDao.findAll();
	}

	@Override
	public Student addNewStudent(FormData_Student formData) {
		
		try {
			
			String[] date = formData.getDob().split("-");
			if(date.length<3) throw new Exception("Unsupported date format");
			
			Student student = new Student();
			student.setId(formData.getId());
			student.setName(formData.getName());
			student.setEmail(formData.getEmail());
			student.setPicture(formData.getPicture());
			student.setDob(LocalDate.of(Integer.parseInt(date[0]), Integer.parseInt(date[1]), Integer.parseInt(date[2])));
			student.setAadharNumber(formData.getAadharNumber());
			
			Account ac = student.getBankAcc();
			ac.setAcc_holderName(formData.getAccount().getAcc_holderName());
			ac.setAcc_No(formData.getAccount().getAcc_No());
			ac.setAcc_Type(formData.getAccount().getAcc_Type());
			ac.setBankName(formData.getAccount().getBankName());
			ac.setIFSC_Code(formData.getAccount().getIFSC_Code());
			
			student.setAddress(formData.getAddress());
			student.setGender(formData.getGender());
			student.setPhoneNumber(formData.getPhoneNumber());
			
			List<Qualification> qual = student.getQualifications();
			for(QualificationForm fm : formData.getQualifications()) {
				qual.add(new Qualification(fm));
			}
			
			List<Course> cors = student.getCourses();
			for(Long id:formData.getCourseId()) {
				cors.add(this._courseService.getCourseById(id));
			}
			
			return this.studentDao.save(student);
			
			
		}
		catch(Exception e) {
			System.out.println("Service layer ..... " + e);
			return null;
		}
	}

	@Override
	public boolean deleteStudentById(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

}
