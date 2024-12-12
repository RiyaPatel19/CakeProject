package com.sheryians.major.model;

import jakarta.persistence.*;
import lombok.Data;   // @Data fulfills the requirement of getters nd setters, so we don't have to.

@Entity
@Data
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "category_id")
    private int id;

    private String name;
}
