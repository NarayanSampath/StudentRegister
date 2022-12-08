package com.sample.studentregister.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.studentregister.dao.StudentDAO;
import com.sample.studentregister.model.Student;
import com.sample.studentregister.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	
	@Autowired
	StudentService studentService;

	@GetMapping
	public List<Student> getAllStudent() {
		return studentService.getAllStudent();
	}

	@GetMapping("/{id}")
	public Student getStudentById(@PathVariable("id") Long studentId) {
		return studentService.getStudentById(studentId);
	}

	@PostMapping(produces = "application/json", consumes = "application/json")
	public Student createStudent(@RequestBody StudentDAO studentDao) {
		System.out.println("Received studentDao : "+ studentDao);
		return studentService.createStudent(studentDao);

	}

	@PutMapping(value = "/{id}", produces = "application/json", consumes = "application/json")
	public Student updateStudent(@PathVariable("id") Long studentId, @RequestBody StudentDAO studentDao) {
		return studentService.updateStudent(studentId, studentDao);

	}
	@DeleteMapping(value="/{id}")
	public Student deleteStudent(@PathVariable("id") Long studentId) {
		return studentService.deleteStudent(studentId);
	}
	
	
}
