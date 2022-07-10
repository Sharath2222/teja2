package com.sample.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.demo.exception.ResourceNotFoundException;
import com.sample.demo.model.Customer;
import com.sample.demo.repository.CustomerRepository;
import java.util.List;

@CrossOrigin(origins="http://localhost:4788")
@RestController
@RequestMapping("/api")
public class CustomerController {
	@Autowired
    CustomerRepository customerRepository;
    
    @GetMapping("/ping")
    public String healthCheck() {
        return "All Ok.";
    }
    
    @GetMapping("/Customers")
    public List<Customer> listAllCustomers() {
        return customerRepository.findAll();
    }
    
    @GetMapping("/Customer/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable(value="id") int id) throws ResourceNotFoundException{
        Customer m = customerRepository.findByCustId(id);

        if (m == null) {
                new ResourceNotFoundException("Member not found. Please register to continue");
        }
        return ResponseEntity.ok().body(m);
    }
    
    @PostMapping("/Customer")
    public ResponseEntity<Customer> saveCustomerDetails(@RequestBody Customer cust) {
    	customerRepository.save(cust);
        return ResponseEntity.ok().body(cust);
    }
    

}
