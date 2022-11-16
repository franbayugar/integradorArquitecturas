package com.producto.service;

import com.producto.model.Product;
import com.producto.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Properties;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;


    public Product newProduct(Product p) {
        return productRepository.save(p);
    }

    public List<Product> getProducts(){
        return productRepository.findAll();
    }

    public Product updateProduct(Product productUpdated, Integer id) {
        Product product = productRepository.getReferenceById(id);
        product.setName(productUpdated.getName());
        product.setPrice(productUpdated.getPrice());
        return productRepository.save(product);
    }
}
