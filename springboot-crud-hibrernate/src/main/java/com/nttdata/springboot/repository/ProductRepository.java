package com.nttdata.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nttdata.springboot.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}