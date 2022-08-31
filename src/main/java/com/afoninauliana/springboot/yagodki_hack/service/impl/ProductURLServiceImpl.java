package com.afoninauliana.springboot.yagodki_hack.service.impl;

import com.afoninauliana.springboot.yagodki_hack.service.api.LoadService;
import com.afoninauliana.springboot.yagodki_hack.service.api.ProductURLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductURLServiceImpl implements ProductURLService {
    //TODO https://www.wildberries.ru/catalog/11996489/detail.aspx
//    public static final String URL_WB = "http://www.cbr.ru/scripts/XML_daily.asp";
    public static final String URL_WB = "https://www.wildberries.ru/catalog/";
    public static final String PRODUCT_PAGE_HTML_FILERATH = "src/main/resources/html/ProductPage.html";

    @Autowired
    private LoadService loadService;

    public void getHtml (int article){
        String productLink = createProductLink(article);
        loadService.loadXMLfromURL(productLink, PRODUCT_PAGE_HTML_FILERATH);
    }

    public String createProductLink(int article) {
        return URL_WB + article + "/detail.aspx";
    }
}
