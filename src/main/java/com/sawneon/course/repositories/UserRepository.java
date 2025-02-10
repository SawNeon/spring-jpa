package com.sawneon.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sawneon.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
