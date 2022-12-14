package com.afoninauliana.springboot.yagodki_hack.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="products")
public class Product {
    @Id
    @Column(name="article")
    private int article;

    @Column(name="name")
    private String name;

    @Column(name="json_link")
    private String jsonLink;
}
