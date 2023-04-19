package com.example.springsecurityapplicationnew.repositories;

import com.example.springsecurityapplicationnew.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
