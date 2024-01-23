package tech.den.SpringP.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import tech.den.SpringP.repositories.ProductRepository;

@RestController
public class ProductController {
	
	@Autowired
	ProductRepository productRepository;
}
