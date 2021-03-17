package com.nykdev.aulajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nykdev.aulajpa.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
