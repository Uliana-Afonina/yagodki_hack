package com.afoninauliana.springboot.yagodki_hack.service.impl;

import com.codeborne.selenide.Selenide;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class SelenideServiceTest {
    public static final String URL_WB = "https://www.wildberries.ru/catalog/";
//    SelenideService selenideService = new SelenideService();;

    //    @Before
//    public void beforeTest() {
//        selenideService = new SelenideService();
//    }
//
    public void goToProductPage(String article) {
//        String url = URL_WB + article + "/detail.aspx";

        Selenide.open("https://www.wildberries.ru/catalog/11996489/detail.aspx");
    }

    @Test
    public void goToProductPageTest() {
//        selenideService.init();
//        SelenideService selenideService = new SelenideService();
        Selenide.open("https://www.wildberries.ru/catalog/11996489/detail.aspx");
//        goToProductPage("11996489");
    }

}