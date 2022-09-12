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
public class Price {
    private long rub;
}
