package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Pizza;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza, Integer> {

}
