package com.sample.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.demo.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{
    public Customer findByEmail(String email);
    public Customer findByCustId(int custId);
    public Customer findTopByOrderByCustIdDesc();
    

}
