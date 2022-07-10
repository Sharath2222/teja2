package com.sample.demo.controller;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sample.demo.exception.ResourceNotFoundException;
import com.sample.demo.model.Product;
import com.sample.demo.repository.ProductRepository;

@CrossOrigin(origins="http://localhost:4788")
@RestController
@RequestMapping("/api")
public class ProductController {
	
	@Autowired
    ProductRepository productRepository;
    
    @GetMapping("/ping1")
    public String healthCheck() {
        return "All Ok.";
    }
    
    @GetMapping("/products")
    public List<Product> listAllProducts() {
        return productRepository.findAll();
    }
    
    
    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable(value="id") int id) throws ResourceNotFoundException{
        Product m = productRepository.findByProId(id);

        if (m == null) {
                new ResourceNotFoundException("Product not found.");
        }
        return ResponseEntity.ok().body(m);
    }
    
    @PostMapping("/product")
    public ResponseEntity<Product> saveProductDetails(@RequestBody Product pro) {
    	productRepository.save(pro);
        return ResponseEntity.ok().body(pro);
    }
    
    @PutMapping("/product/update/{id}")
	public ResponseEntity<Product> updateProduct(@PathVariable int id, @RequestBody Product productDetails){
		Product pro = productRepository.findByProId(id);
		if(pro==null) {
			new ResourceNotFoundException("product not exist with id :" + id);
		}
		
		pro.setPrice(productDetails.getPrice());
		pro.setSpecification(productDetails.getSpecification());
		pro.setTotalQty(productDetails.getTotalQty());
		pro.setAvailableQty(productDetails.getAvailableQty());
		
		Product updatedProduct = productRepository.save(pro);
		return ResponseEntity.ok(updatedProduct);
	}
    
    @DeleteMapping("/product/delete/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteProduct(@PathVariable int id){
		Product pro = productRepository.findByProId(id);
		if(pro==null)
			{
			new ResourceNotFoundException("product not exist with id :" + id);
			}
		
		productRepository.delete(pro);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
    


}
