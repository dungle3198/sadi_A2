package com.example.sadi_A2.controller;

import java.util.List;

import com.example.sadi_A2.model.Category;
import com.example.sadi_A2.model.Product;
import com.example.sadi_A2.service.CategoryService;
import com.example.sadi_A2.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController
{
    @Autowired
    private com.example.sadi_A2.service.CategoryService categoryService;

    @RequestMapping(path = "/categories", method = RequestMethod.GET)
    public List<Category> getAllCategories(){
        return categoryService.getAllCategories();
    }
}
