package com.sample.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.demo.exception.ResourceNotFoundException;
import com.sample.demo.model.Admin;
import com.sample.demo.repository.AdminRepository;

@CrossOrigin(origins="http://localhost:4788")
@RestController
@RequestMapping("/api")
public class AdminController {
	
    @Autowired
    AdminRepository adminRepository;
    
    @GetMapping("/ping3")
    public String healthCheck() {
        return "All Ok.";
    }
    
    @GetMapping("/Admin/{id}")
    public ResponseEntity<Admin> getAdminById(@PathVariable(value="id") int id) throws ResourceNotFoundException{
        Admin m = adminRepository.findById(id);

        if (m == null) {
                new ResourceNotFoundException("Admin not found. Please register to continue");
        }
        return ResponseEntity.ok().body(m);
    }

}
