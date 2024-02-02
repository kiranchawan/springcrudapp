package com.springcrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springcrud.entity.StudentEntity;
import com.springcrud.repo.StudentRepo;

@Service
public class StudentService {

	@Autowired
	private StudentRepo studentRepo;
	
	public StudentEntity addNewStudent(StudentEntity studentEntity) {
		
		StudentEntity st = studentRepo.save(studentEntity);
		return st;
	}

	public List<StudentEntity> getAllStudent() {
		
		List<StudentEntity> list = studentRepo.findAll();
		return list;
	}

        public StudentEntity getStudentById(Integer id)
        {
              StudentEntity st = studentRepo.findById(id);
              retrun st;
        }


}
