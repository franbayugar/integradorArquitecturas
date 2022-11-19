package com.producto.controller;

import com.producto.model.Product;
import com.producto.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Qualifier("productService")
    @Autowired
    private ProductService service;

    public ProductController(@Qualifier ("productService") ProductService service){
        super();
        this.service = service;
    }

    //metodos para controller
    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return service.getProducts();
    }

    @PostMapping("/products")
    public Product newProduct(@RequestBody Product p){
        return service.newProduct(p);
    }
    //devolveria un listado de productos

    @PutMapping("/products/{id}")
    Product modifyProduct (@RequestBody Product productUpdated, @PathVariable Integer id) {return service.updateProduct(productUpdated,id);}

}