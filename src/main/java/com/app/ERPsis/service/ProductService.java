package com.app.ERPsis.service;

import com.app.ERPsis.model.Category;
import com.app.ERPsis.model.Product;
import com.app.ERPsis.repositories.CategoryRepository;
import com.app.ERPsis.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll(){
        return productRepository.findAll();
    }

    public Product findById(Long id){
        Optional<Product> obj = productRepository.findById(id);
        return obj.get();
    }
}
