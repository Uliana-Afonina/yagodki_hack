package com.afoninauliana.springboot.yagodki_hack.service.api;

import com.afoninauliana.springboot.yagodki_hack.entity.Product;

import java.util.List;

public interface ProductDataProcessorService {
    public List<Integer> getArticles(List<Product> productList);
}
