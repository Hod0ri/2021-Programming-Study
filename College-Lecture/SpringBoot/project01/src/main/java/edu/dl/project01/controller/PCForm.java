package edu.dl.project01.controller;

import lombok.Setter;
import lombok.Getter;

@Getter @Setter
public class PCForm {
    private Long id;
    private String name;
    private int price;
    private int stockQuantity;
    private String manufacturer;
    private String serialNumber;
}
