package com.sample.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sample.demo.model.Seller;

public interface SellerRepository extends JpaRepository<Seller, Integer> {
    public Seller findBySellId(int id);
    public Seller findByemail(int id);

}
