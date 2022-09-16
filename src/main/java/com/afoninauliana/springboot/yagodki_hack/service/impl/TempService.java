package com.afoninauliana.springboot.yagodki_hack.service.impl;

import com.afoninauliana.springboot.yagodki_hack.entity.Product;
import com.afoninauliana.springboot.yagodki_hack.service.api.LoadService;
import com.afoninauliana.springboot.yagodki_hack.service.api.ProductDataProcessorService;
import com.afoninauliana.springboot.yagodki_hack.service.api.ProductRepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TempService {
    @Autowired
    private ProductDataProcessorService productDataProcessorService;
    @Autowired
    private LoadService loadService;
    @Autowired
    private ProductRepositoryService productRepositoryService;
    @Autowired
    private JsonHandlerService jsonHandlerService;

//TODO разобраться с формированием урла
    private final String URL = "https://basket-01.wb.ru/vol119/part11996/11996489/info/price-history.json";

    public void justDoIt () {
        List<Integer> allArticles = productDataProcessorService.getAllArticles();
        List<Product> allProducts = productRepositoryService.getAllProducts();
        List<Product> lowPriceProducts = new ArrayList<>();

        for (int i =0; i < allArticles.size(); i++) {
            Product product = allProducts.get(i);
            String jsonLink = product.getJsonLink();
            int article = product.getArticle();
            //https://basket-01.wb.ru/vol119/part11996/11996489/info/price-history.json
            String filePath = "src/main/resources/json/price-history-" + article + ".json";
            loadService.loadFileFromURL(jsonLink, filePath);
            double averagePrice = jsonHandlerService.getAveragePriceFromJson(filePath);
            int currentPrice = jsonHandlerService.getLastPriceFromJson(filePath);
            if (currentPrice<=averagePrice) {
                //TODO запилить отправку сбщ в телегу
                lowPriceProducts.add(product);
                System.out.println(product.getName());
                System.out.println(product.getArticle());
            }

        }
        //TODO для каждого артикля нужно сходить на сайт и считать историю цен (вычислить среднюю цену) и текущую цену
        // getCurrentPrice(article) (последний элемент массива и есть текущая цена) и getAveragePrice(article) (этот метод уже есть в com/afoninauliana/springboot/yagodki_hack/service/impl/JsonHandlerService.java)
        // если getCurrentPrice(article) <= getAveragePrice(article), то добавить в List
        // https://basket-01.wb.ru/vol119/part11996/11996489/info/ru/card.json
    }

    private List<Product> getAllProducts() {
        return productRepositoryService.getAllProducts();
    }

}
