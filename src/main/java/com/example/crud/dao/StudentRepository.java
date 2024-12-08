package com.example.crud.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.crud.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>{

}
