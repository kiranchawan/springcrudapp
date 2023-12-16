package com.springcrud.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springcrud.entity.StudentEntity;

@Repository
public interface StudentRepo extends JpaRepository<StudentEntity,Integer> {

}
