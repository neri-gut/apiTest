package com.api.crud.service;

import com.api.crud.entity.CategoryProduct;
import com.api.crud.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CategoryProductService{

  @Autowired
  CategoryRepository categoryProductService;

  public List<CategoryProduct> getCategories(){
    return categoryProductService.findAll();
  }

  public Optional<CategoryProduct> getCategory(Long id){
    return categoryProductService.findById(id);
  }

  public void saveCategory(CategoryProduct category){
    categoryProductService.save(category);
  }

  public void deleteCategory(Long category){
    categoryProductService.deleteById(category);
  }

}
