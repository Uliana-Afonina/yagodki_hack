package com.afoninauliana.springboot.yagodki_hack.service.impl;

import com.afoninauliana.springboot.yagodki_hack.service.api.LoadService;
import com.afoninauliana.springboot.yagodki_hack.service.api.ProductURLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.List;

@Service
public class ProductURLServiceImpl implements ProductURLService {
    public static final String URL_CBRF_RATES = "http://www.cbr.ru/scripts/XML_daily.asp";
    public static final String RATES_XML_FILERATH = "src/main/resources/xml/valutesFromCBRF.html";

    @Autowired
    private LoadService loadService;

    public void getHtml (){
        loadService.loadXMLfromURL(URL_CBRF_RATES, RATES_XML_FILERATH);
    }
}
