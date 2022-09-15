package com.afoninauliana.springboot.yagodki_hack.service.impl;

import com.afoninauliana.springboot.yagodki_hack.service.api.LoadService;
import com.afoninauliana.springboot.yagodki_hack.service.api.ProductDataProcessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Temp {
    @Autowired
    private ProductDataProcessorService productDataProcessorService;
    @Autowired
    private LoadService loadService;
//TODO разобраться с формированием урла
    private final String URL = "https://basket-01.wb.ru/vol119/part11996/11996489/info/price-history.json";

    public void justDoIt () {
        List<Integer> allArticles = productDataProcessorService.getAllArticles();

        for (int i =0; i < allArticles.size(); i++) {
            Integer currentArticle = allArticles.get(i);
            //https://basket-01.wb.ru/vol119/part11996/11996489/info/price-history.json
            loadService.loadFileFromURL(,);

        }
        //TODO для каждого артикля нужно сходить на сайт и считать историю цен (вычислить среднюю цену) и текущую цену
        // getCurrentPrice(article) (последний элемент массива и есть текущая цена) и getAveragePrice(article) (этот метод уже есть в com/afoninauliana/springboot/yagodki_hack/service/impl/JsonHandlerService.java)
        // если getCurrentPrice(article) <= getAveragePrice(article), то добавить в List
        // https://basket-01.wb.ru/vol119/part11996/11996489/info/ru/card.json
    }

}
