package com.aura_snack.products_service.repositories;

import com.aura_snack.products_service.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
