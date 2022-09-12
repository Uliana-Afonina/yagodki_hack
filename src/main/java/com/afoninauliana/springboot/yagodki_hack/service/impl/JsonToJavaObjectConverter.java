package com.afoninauliana.springboot.yagodki_hack.service.impl;

import com.afoninauliana.springboot.yagodki_hack.entity.PriceData;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;

@Service
public class JsonToJavaObjectConverter {

    public void jsonToJavaObjectConversion () {
        ObjectMapper objectMapper = new ObjectMapper();

        File json = new File("src/main/resources/json/11996489.json");
// Deserialization into the `Employee` class
        PriceData priceData = null;
        try {
            priceData = objectMapper.readValue(json, PriceData.class);
        } catch (IOException e) {
            e.printStackTrace();
        }

// Print information
        System.out.println(priceData);
    }
}
