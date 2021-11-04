package com.m4u.study.controller;

import com.m4u.study.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.m4u.study.model.Student;
import org.springframework.http.MediaType;
import java.util.List;

@RestController
public class StudentController {
	@Autowired
	StudentService studentService;

	@RequestMapping(method = RequestMethod.POST, value = "/student", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Student> cadastrarStudent(@RequestBody Student student){
		Student studentSalvo = studentService.cadastrar(student);
		return new ResponseEntity<>(studentSalvo, HttpStatus.CREATED);

	}

	@RequestMapping(method = RequestMethod.GET, value = "/student", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Student>> buscarStudent(){
		List<Student> studentEncontrado = studentService.buscarTodos();
		return new ResponseEntity<>(studentEncontrado, HttpStatus.OK);

	}

	@RequestMapping(method = RequestMethod.DELETE, value= "/student/{id}")
	public ResponseEntity<Student> excluirStudent(@PathVariable Integer id){
		Student studentEncontrado = studentService.buscarPorId(id);
		if(studentEncontrado == null){
			return new ResponseEntity<>(studentEncontrado, HttpStatus.NOT_FOUND);
		}else{
			studentService.excluir(studentEncontrado);
			return new ResponseEntity<>( HttpStatus.OK);

		}

	}

	@RequestMapping(method = RequestMethod.PUT, value = "/student", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Student> alterarStudent(@RequestBody Student student){
		Student studentAlterado = studentService.alterar(student);
		return new ResponseEntity<>(studentAlterado, HttpStatus.OK);

	}

}
