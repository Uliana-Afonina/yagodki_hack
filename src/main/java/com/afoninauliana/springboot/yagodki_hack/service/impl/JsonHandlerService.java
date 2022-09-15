package com.afoninauliana.springboot.yagodki_hack.service.impl;

import com.jayway.jsonpath.JsonPath;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;

@Service
public class JsonHandlerService {

    public double getAveragePriceFromJson(String expression, File json){
//        File json = new File("src/main/resources/json/price-history.json");
        double avg = 0;
        try {
            avg = JsonPath.parse(json).read(expression);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return avg;
    }

}
