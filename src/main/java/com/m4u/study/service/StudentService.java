package com.m4u.study.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.m4u.study.Repository.StudentRepository;
import com.m4u.study.model.Student;

@Service
public class StudentService {
	
	
	@Autowired
	StudentRepository studentRepository;
	
	public Student cadastrar(Student student) {
		return studentRepository.save(student);
	}
	
	public List<Student> buscarTodos(){
		return studentRepository.findAll();
	}
	
	public void excluir(Student student) {
		studentRepository.delete(student);
	}
	
	@SuppressWarnings("deprecation")
	public Student buscarPorId(Integer idStudent) {
		 return studentRepository.getOne(idStudent);
		
	}
	
	public Student alterar(Student student) {
		studentRepository.save(student);
		return student;
	}
	

}
