package com.afoninauliana.springboot.yagodki_hack.service.impl;

import org.jsoup.Jsoup;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.jsoup.nodes.Document;


import java.io.File;
import java.io.IOException;

@Service
public class HtmlParserService {

    @Autowired
    private ProductURLServiceImpl productURLServiceImpl;

    public Elements getElement(String cssQuery) {
        File file = new File(productURLServiceImpl.PRODUCT_PAGE_HTML_FILEPATH);
        //Elements currentPrice = document.select(".price-block__final-price");
        Document document = null;
        {
            try {
                //"https://www.wildberries.ru/"
                document = Jsoup.parse(file, "UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //".price-block__final-price"
        Elements selectedElements = document.select(cssQuery);
        return selectedElements;
    }

    public Document getDocument(){
        Document doc = null;
        try {
            doc = Jsoup.connect("https://www.wildberries.ru/")
                    .userAgent("Chrome/92.0.4515.159")
                    .referrer("https://www.wildberries.ru/catalog/11996489/detail.aspx")
                    .get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return doc;
    }
}
