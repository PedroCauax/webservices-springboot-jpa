package com.webservice.demo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webservice.demo.DTO.ProductDTO;
import com.webservice.demo.entities.Product;
import com.webservice.demo.services.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {
	@Autowired
	private ProductService productService;

	@GetMapping
	public List<ProductDTO> findAll() {
	    return productService.findAll()
	        .stream()
	        .map(p -> new ProductDTO(p.getId(), p.getName()))
	        .toList();
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id) {
		Product obj = productService.findById(id);
		return ResponseEntity.ok().body(obj);
	}

}
