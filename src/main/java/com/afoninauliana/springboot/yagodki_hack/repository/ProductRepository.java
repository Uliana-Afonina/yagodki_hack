package com.afoninauliana.springboot.yagodki_hack.repository;

import com.afoninauliana.springboot.yagodki_hack.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
