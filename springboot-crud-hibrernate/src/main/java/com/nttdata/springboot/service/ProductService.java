package com.nttdata.springboot.service;

import java.util.List;

import com.nttdata.springboot.model.Product;

public interface ProductService {
	Product createProduct(Product product);

	Product updateProduct(Product product);

	List<Product> getAllProduct();

	Product getProductById(long productId);

	void deleteProduct(long id);
}