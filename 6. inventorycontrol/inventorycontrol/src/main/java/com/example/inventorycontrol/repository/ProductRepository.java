package com.example.inventorycontrol.repository;

import com.example.inventorycontrol.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
