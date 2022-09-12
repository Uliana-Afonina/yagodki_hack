package com.afoninauliana.springboot.yagodki_hack.service.impl;

import org.jsoup.select.Elements;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HtmlParserServiceTest {
    HtmlParserService htmlParserService = new HtmlParserService();
    String cssOfCurrentPrice = ".price-block__final-price";
    LoadServiceImpl loadService = new LoadServiceImpl();

    @Test
    public void test() {
        loadService.loadXMLfromURL("https://card.wb.ru/cards/detail?spp=0&regions=68,83,4,38,80,33,82,86,30,22,31,40,1,48&pricemarginCoeff=1.0&reg=0&appType=1&emp=0&locale=ru&lang=ru&curr=rub&couponsGeo=3,6,19,21,8&dest=-1059500,-3788485,-3828424,-3827446&nm=11996489"
                , "src/main/resources/html/ProductPage.json");
        Elements currentPrice = htmlParserService.getElement(cssOfCurrentPrice);
        System.out.println(currentPrice.size());
        System.out.println(currentPrice.attr("class"));
    }

    @Test
    public void getDocumentTest () {
        htmlParserService.getDocument();
    }

}