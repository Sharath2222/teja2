package com.sample.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.demo.model.Product;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    public Product findByProId(int id);
    
    public Product findTopByOrderByProIdDesc();
    
    public List<Product> findAllByProId(int id);
}
