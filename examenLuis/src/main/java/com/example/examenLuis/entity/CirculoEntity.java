package com.example.examenLuis.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table
@Data
public class CirculoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false, name = "radio")
    private int radio;
    @Column(nullable = false, name = "color")
    private String color;
    @Column(nullable = false, name = "area")
    private double area;

    public CirculoEntity(int radio, String color) {
        this.radio = radio;
        this.color = color;
    }

}
