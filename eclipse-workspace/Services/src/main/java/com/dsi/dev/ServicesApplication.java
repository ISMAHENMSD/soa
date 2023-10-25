package com.dsi.dev;



import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.dsi.dev.Repository.ProductRepository;

import entity.Product;

@SpringBootApplication
@EntityScan("entity")
public class  ServicesApplication  {

  public static void main(String[] args) {
    SpringApplication.run( ServicesApplication .class, args);
  }
  
  CommandLineRunner start(ProductRepository r) {
	  return args ->{r.save(new Product("pc", 2548.0, 1.0f));
	  r.save(new Product("pc", 1500.0, 1.0f));
	  r.save(new Product("clavier", 258.0, 1.0f));
	  
	  };
  }

}