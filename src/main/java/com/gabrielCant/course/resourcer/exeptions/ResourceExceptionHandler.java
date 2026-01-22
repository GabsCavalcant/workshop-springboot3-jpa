package com.gabrielCant.course.resourcer.exeptions;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.gabrielCant.course.services.exeption.ResourseNotFoundException;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExceptionHandler {
	
	
	//Anotação demarcada para quando chamar a função ResourseNotFoundException ela tratar tudo que está dentro dela.
	@ExceptionHandler(ResourseNotFoundException.class)
	public ResponseEntity <StandardError> resourceNotFound(ResourseNotFoundException e, 
			HttpServletRequest request){
		String error = "Resource Not Found"; //mensagem personalizada
		HttpStatus status = HttpStatus.NOT_FOUND; //status not faund do http
		
		StandardError err = new StandardError(Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI());
				
		return ResponseEntity.status(status).body(err);
	} 

}
