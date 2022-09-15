package com.afoninauliana.springboot.yagodki_hack.service.impl;


import com.afoninauliana.springboot.yagodki_hack.service.api.LoadService;
import org.springframework.stereotype.Service;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

@Service
public class LoadServiceImpl implements LoadService {
// url = http://www.cbr.ru/scripts/XML_daily.asp
//    filePath = src/main/resources/xml/file_name.xml
    public void loadFileFromURL(String url, String filePath) {
        try {
            FileUtils.copyURLToFile(
                    new URL(url),
                    new File(filePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
