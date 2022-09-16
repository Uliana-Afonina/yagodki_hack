package com.afoninauliana.springboot.yagodki_hack.service.impl;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class TempServiceTest {
    private TempService tempService;

    @Before
    public void init() {
//        temp = new Temp();
    }

    @Test
    public void testGetProductWithLowPrice() {
        tempService = new TempService();
        tempService.justDoIt();
    }

}