package com.gabrielCant.course.entities.enums;

public enum OrderStatus {
	
	WAITING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),
	DELIVERED(4),
	CANCELED(5);
	
	private int code;
	
	//Utilizado para poder Setar os numeros nos tipos enumeros, para melhor manutenção
	
	private OrderStatus(int code) {
		this.code = code;
	}
	//um metodo publico retornando o code, que sera visivel a outras classes
	public int getCode() {
		return code;
	}
	
	public static OrderStatus valueOF(int code) {
		for(OrderStatus value : OrderStatus.values()) {
			if (value.getCode() == code) {
				return value;
			}
		}
		
		throw new IllegalArgumentException("Code invalid");
	}
}
