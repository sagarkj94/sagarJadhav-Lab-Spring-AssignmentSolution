package com.collegefest.studentmanagementspring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.collegefest.studentmanagementspring.entity.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

	List<Student> findByNameContainsAndDepartmentContainsAllIgnoreCase(String name, String department);

}
