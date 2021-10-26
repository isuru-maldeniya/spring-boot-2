package com.example.springboot2.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
public class TestDTO {
    private int id;
    private String name;
    private String address;


    public TestDTO(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public TestDTO() {
    }
}
