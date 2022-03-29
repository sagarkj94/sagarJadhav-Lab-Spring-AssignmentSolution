package com.collegefest.studentmanagementspring.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.collegefest.studentmanagementspring.entity.Student;
import com.collegefest.studentmanagementspring.repository.StudentRepository;
import com.collegefest.studentmanagementspring.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {


	@Autowired
	StudentRepository studentRepository;

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		List<Student> student=studentRepository.findAll();
		return student;
	}

	@Override
	public Student findById(int theId) {
		// TODO Auto-generated method stub
		return studentRepository.findById(theId).get();
	}

	@Override
	public void save(Student theStudent) {
		// TODO Auto-generated method stub
		studentRepository.save(theStudent);
	}

	@Override
	public void deleteById(int theId) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(theId);
	}

	@Override
	public List<Student> searchBy(String name, String department) {
		// TODO Auto-generated method stub
		List<Student> students=studentRepository.findByNameContainsAndDepartmentContainsAllIgnoreCase(name,department);
		
		return students;
	}

	



}
