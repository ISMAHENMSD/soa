package com.dsi.dev.web;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dsi.dev.Repository.ProductRepository;

import entity.Product;

@RestController
public class ProductController {
	
	ProductRepository rp;
	
	
	public ProductController(ProductRepository r) {
		this.rp=r;
	}


	@GetMapping (path="/produits/")
	public List<Product>getProduct(){
		return rp.findAll();
		
	}
	@GetMapping (path="/produits/{id}")
	public Product getProduct(@PathVariable Long id) {
		return rp.findById(id).get();
	}
@PostMapping(path="/produits")
public Product AddProduct( @RequestBody Product p) {
	return rp.save(p);
	
}

}
