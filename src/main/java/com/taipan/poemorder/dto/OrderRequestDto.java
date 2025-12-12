package com.taipan.poemorder.dto;

import lombok.Data;

@Data
public class OrderRequestDto {
    private String firstName;
    private String lastName;
    private String phone;
    private String socialLinks;
    private String description;
}