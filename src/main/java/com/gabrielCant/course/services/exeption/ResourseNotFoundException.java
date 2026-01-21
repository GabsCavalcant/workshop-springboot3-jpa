package com.gabrielCant.course.services.exeption;

public class ResourseNotFoundException extends RuntimeException {

	//criação da class personalizada, 404 passando o id como ref
	private static final long serialVersionUID = 1L;

	public ResourseNotFoundException(Long id) {
		super("Resourse not found " + id);
	}
}
