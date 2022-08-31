package com.afoninauliana.springboot.yagodki_hack.service.impl;

import com.afoninauliana.springboot.yagodki_hack.entity.Product;
import com.afoninauliana.springboot.yagodki_hack.repository.ProductRepository;
import com.afoninauliana.springboot.yagodki_hack.service.api.ProductRepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductRepositoryServiceImpl implements ProductRepositoryService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts () {
        return productRepository.findAll();
    }
}
