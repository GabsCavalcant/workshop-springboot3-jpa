package com.gabrielCant.course.resourcer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gabrielCant.course.entities.User;
import com.gabrielCant.course.services.UserService;

//Anotação para mostrar que essa classe é um recurso que pode utilziar um controlador Rest 
@RestController
@RequestMapping(value = "/users")
public class UserResoucer {
	
	@Autowired
	
	private UserService service;
	
	//endpoint para acesar usuario
	
	//para retornar uma respostas de requisição web
	
	@GetMapping
	public ResponseEntity<List<User>> findAll( ){
		List<User> list = service.findall();
		
		return ResponseEntity.ok().body(list);
	}
	@GetMapping(value = "/{id}") //@PathVariable para "linkar" com o valor id dado no mapping
	public ResponseEntity<User> findById(@PathVariable Long id){
		User obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}

}
