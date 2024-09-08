package com.aura_snack.products_service.repositories;

import com.aura_snack.products_service.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
