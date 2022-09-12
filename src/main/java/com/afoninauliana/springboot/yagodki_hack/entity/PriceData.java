package com.afoninauliana.springboot.yagodki_hack.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Entity
public class PriceData {

    private long dt;
    private Price price;

}
