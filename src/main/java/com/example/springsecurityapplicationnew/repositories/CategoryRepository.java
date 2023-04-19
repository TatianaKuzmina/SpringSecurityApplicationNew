package com.example.springsecurityapplicationnew.repositories;

import com.example.springsecurityapplicationnew.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
    com.example.springsecurityapplicationnew.models.Category findByName(String name);
}
