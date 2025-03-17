package com.sawneon.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sawneon.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
}
