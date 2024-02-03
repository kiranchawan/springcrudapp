package com.springcrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springcrud.entity.StudentEntity;
import com.springcrud.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	//to add new student to database
	@PostMapping("/addStudent")
	public StudentEntity addStudent(@RequestBody StudentEntity studentEntity)
	{
		StudentEntity st = studentService.addNewStudent(studentEntity);
		return st;
	}
	
	@GetMapping("/getAllStudent")
	public List<StudentEntity> getAllStudent()
	{
		List<StudentEntity> liststudent= studentService.getAllStudent();
		return liststudent;
	}
        
        @DeleteMapping("/deletestudentbyid/{id}")
	public List<StudentEntity> deleteStudentById(@PathVariable Integer id)
	{
		studentService.deleteStudent(id);
		return "student deleted successfully";
	}

}
