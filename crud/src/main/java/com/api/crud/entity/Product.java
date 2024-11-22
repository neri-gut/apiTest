package com.api.crud.entity;


import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "tbl_product")
public class Product {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long productId;

  @Column(name = "product_name", nullable = false)
  private String name;

  @Column(name = "category_product")
  private Long categoryId;

  @Column(name = "description_product")
  private String description;

  @Column(name = "product_name", nullable = false)
  private Long price;

  @Column(name = "stock_product", nullable = false)
  private Integer stock;

  @Column(name = "url_image")
  private String imageUrl;

  @CreationTimestamp
  @Column(name = "date_creation_product")
  private LocalDateTime createDate;

  @UpdateTimestamp
  @Column(name = "last_update_product")
  private LocalDateTime updateDate;

}
