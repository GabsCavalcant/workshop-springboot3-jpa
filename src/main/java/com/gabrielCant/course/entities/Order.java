/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gabrielCant.course.entities;

<<<<<<< HEAD
import java.io.Serializable;
import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.gabrielCant.course.entities.enums.OrderStatus;

=======
>>>>>>> 0847861d79bfcb6c162e007ec562ee9af97337c0
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
<<<<<<< HEAD
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
=======
import java.io.Serializable;
import java.time.Instant;
import org.hibernate.annotations.ManyToAny;
>>>>>>> 0847861d79bfcb6c162e007ec562ee9af97337c0

/**
 *
 * @author gabri
 */
@Entity
<<<<<<< HEAD
@Table(name = "tb_order")
public class Order implements Serializable{
    
    private static final Long serialVersionUID = 1L;
    
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private Integer orderStatus;
    
    
    //Colocando o formato ISO 8601 utilizando anotation.
    @JsonFormat (shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'",
    		timezone = "GMT")
    private Instant moment;
    
    @ManyToOne
=======
public class Order implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Instant moment;
    
    @ManyToAny
>>>>>>> 0847861d79bfcb6c162e007ec562ee9af97337c0
    @JoinColumn(name = "cliente_id")
    private User client;
    
    public Order(){
        
    }

<<<<<<< HEAD
    public Order(Long id, Instant moment,OrderStatus orderStatus, User client) {
    	super();
        this.id = id;
        this.moment = moment;
        setOrderStatus(orderStatus);
        this.client = client;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
=======
    public Order(long id, Instant moment, User client) {
        this.id = id;
        this.moment = moment;
        this.client = client;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
>>>>>>> 0847861d79bfcb6c162e007ec562ee9af97337c0
        this.id = id;
    }

    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }
<<<<<<< HEAD
    
    
    public OrderStatus getOrderStatus() {
		return OrderStatus.valueOF(orderStatus);
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		if(orderStatus != null) {
		this.orderStatus = orderStatus.getCode();
		}
	}

	public User getClient() {
=======

    public User getClient() {
>>>>>>> 0847861d79bfcb6c162e007ec562ee9af97337c0
        return client;
    }

    public void setClient(User client) {
        this.client = client;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + (int) (this.id ^ (this.id >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Order other = (Order) obj;
        return this.id == other.id;
    }
    
    
    
}
