package com.example.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud.dao.StudentRepository;
import com.example.crud.model.Student;

@Service
public class StudentService {

	@Autowired
	StudentRepository ob;
	
	//insert data
	public void savefile(Student s)
	{
		ob.save(s);
	}

		public List<Student> get()
		{
			return ob.findAll();
		}
		public void get2(int id) {
			ob.deleteById(id);
		}
		public Optional<Student>get3(int id){
			return ob.findById(id);
		}


}
