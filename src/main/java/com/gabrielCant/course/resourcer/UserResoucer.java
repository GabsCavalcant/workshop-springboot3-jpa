package com.gabrielCant.course.resourcer;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gabrielCant.course.entities.User;

//Anotação para mostrar que essa classe é um recurso que pode utilziar um controlador Rest 
@RestController
@RequestMapping(value = "/usuario")
public class UserResoucer {
	
	//endpoint para acesar usuario
	
	//para retornar uma respostas de requisição web
	
	@GetMapping
	public ResponseEntity<User> findAll( ){
		User u = new User(1l, "maria", "maria@gmail.com", "88888", "1134");
		
		return ResponseEntity.ok().body(u);
	}

}
