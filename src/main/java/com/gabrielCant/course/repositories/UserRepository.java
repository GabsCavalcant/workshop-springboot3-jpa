package com.gabrielCant.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabrielCant.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
