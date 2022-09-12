package com.afoninauliana.springboot.yagodki_hack.service.impl;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.springframework.stereotype.Service;

import static com.codeborne.selenide.Browsers.CHROME;

import java.io.File;
import java.net.MalformedURLException;

import static com.codeborne.selenide.Configuration.browserCapabilities;
import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.$x;

@Service
public class SelenideService {
    public static final String URL_WB = "https://www.wildberries.ru/catalog/";

    protected int wait = 100000;
    protected int waitInterval = 50;

    //https://www.wildberries.ru/catalog/11996489/detail.aspx
    public void init() {
        ChromeOptions options = new ChromeOptions();
        DesiredCapabilities capabilities = new DesiredCapabilities();

        browserCapabilities.setCapability(ChromeOptions.CAPABILITY, options);
        //настройки браузера
        browser = CHROME;
        startMaximized = true;
//        downloadsFolder = "Z:\\files_for_tests\\downloads";
        headless = false;
        screenshots = true;

        Selenide.clearBrowserCookies();
//        Selenide.open(url);
    }
//
//    public void clickByElement(String locator) {
//        $x(locator)
//                .waitUntil(Condition.visible, wait, waitInterval)
//                .should(Condition.enabled)
//                .click();
//    }

    public void goToProductPage (String article){
        String url = URL_WB + article + "/detail.aspx";
        Selenide.open(url);
    }
    //TODO https://card.wb.ru/cards/detail?spp=0&regions=68,83,4,38,80,33,82,86,30,22,31,40,1,48&pricemarginCoeff=1.0&reg=0&appType=1&emp=0&locale=ru&lang=ru&curr=rub&couponsGeo=3,6,19,21,8&dest=-1059500,-3788485,-3828424,-3827446&nm=11996489
}
