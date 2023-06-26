package com.avi.studentsPortal.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.avi.studentsPortal.model.Student;

public interface StudentDao extends JpaRepository<Student, String> {

}
