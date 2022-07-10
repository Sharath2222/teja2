package com.sample.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.demo.exception.ResourceNotFoundException;
import com.sample.demo.model.Seller;
import com.sample.demo.repository.SellerRepository;

@CrossOrigin(origins="http://localhost:4788")
@RestController
@RequestMapping("/api")
public class SellerController {
	
    @Autowired
    SellerRepository sellerRepository;
    
    @GetMapping("/ping4")
    public String healthCheck() {
        return "All Ok.";
    }
    
    @GetMapping("/Seller/{id}")
    public ResponseEntity<Seller> getSellerById(@PathVariable(value="id") int id) throws ResourceNotFoundException{
        Seller m = sellerRepository.findBySellId(id);

        if (m == null) {
                new ResourceNotFoundException("Seller not found. Please register to continue");
        }
        return ResponseEntity.ok().body(m);
    }

}
