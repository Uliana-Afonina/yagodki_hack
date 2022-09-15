package com.afoninauliana.springboot.yagodki_hack.service.impl;

import com.afoninauliana.springboot.yagodki_hack.entity.Product;
import com.afoninauliana.springboot.yagodki_hack.service.api.ProductDataProcessorService;
import com.afoninauliana.springboot.yagodki_hack.service.api.ProductRepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductDataProcessorServiceImpl implements ProductDataProcessorService {
    @Autowired
    private ProductRepositoryService productRepositoryService;
    @Autowired
    private JsonHandlerService jsonHandlerService;

    @Override
    public List<Integer> getAllArticles() {
        List<Product> productList = productRepositoryService.getAllProducts();
        List<Integer> articles = null;

        for (Product product : productList) {
            articles.add(product.getArticle());
        }
        if (articles == null) {
            throw new RuntimeException("В базе данных нет продуктов.");
        }
        return articles;
    }


}
