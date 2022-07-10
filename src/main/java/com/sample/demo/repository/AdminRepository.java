package com.sample.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.demo.model.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer> {
    public Admin findById(int id);
    
}
