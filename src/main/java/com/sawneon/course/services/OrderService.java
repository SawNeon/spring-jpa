package com.sawneon.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sawneon.course.entities.Order;
import com.sawneon.course.entities.User;
import com.sawneon.course.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order findAById(Long id){
		Optional<Order> obj = repository.findById(id);
		
		return obj.get();
	}
	
}
