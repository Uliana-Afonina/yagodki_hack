package com.afoninauliana.springboot.yagodki_hack.service.impl;

import com.jayway.jsonpath.JsonPath;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;

@Service
public class JsonHandlerService {
    public double getAveragePriceFromJson(String filePath){
        File json = new File(filePath);
        String expression = "$..RUB.avg()";
        double avg = 0;
        try {
            avg = JsonPath.parse(json).read(expression);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return avg;
    }

    public int getLastPriceFromJson(String filePath) {
        File json = new File(filePath);
        String expression = "$..RUB.";
    }
}
