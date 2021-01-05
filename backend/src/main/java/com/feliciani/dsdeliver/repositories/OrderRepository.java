package com.feliciani.dsdeliver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.feliciani.dsdeliver.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
