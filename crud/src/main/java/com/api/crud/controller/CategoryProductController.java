package com.api.crud.controller;

import com.api.crud.entity.CategoryProduct;
import com.api.crud.service.CategoryProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/category")
public class CategoryProductController {

  @Autowired
  private CategoryProductService categoryProductService;

  @GetMapping
  public List<CategoryProduct> getAll(){
    return categoryProductService.getCategories();
  }

  @GetMapping("/{categoryId}")
  public Optional<CategoryProduct> getById(@PathVariable("categoryId") Long categoryProdId){
    return categoryProductService.getCategory(categoryProdId);
  }

  @PostMapping
  public void saveOrUpdate(@RequestBody CategoryProduct categoryProduct){
    categoryProductService.saveCategory(categoryProduct);
  }

  @DeleteMapping("/{categoryId}")
  public void saveDelete(@PathVariable("categoryId") Long categoryProdId){
    categoryProductService.deleteCategory(categoryProdId);
  }


}
