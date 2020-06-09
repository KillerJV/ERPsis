package com.app.ERPsis.service;

import com.app.ERPsis.model.Category;
import com.app.ERPsis.model.User;
import com.app.ERPsis.repositories.CategoryRepository;
import com.app.ERPsis.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll(){
        return categoryRepository.findAll();
    }

    public Category findById(Long id){
        Optional<Category> obj = categoryRepository.findById(id);
        return obj.get();
    }
}
