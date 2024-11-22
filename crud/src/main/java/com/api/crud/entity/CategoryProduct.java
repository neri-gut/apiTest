package com.api.crud.entity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tbl_category")
public class CategoryProduct {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "category_id")
  private Long categoryId;

  @Column(name = "category_name", nullable = false)
  private String categoryName;

  @Column(name = "category_description")
  private String categoryDescription;

}
