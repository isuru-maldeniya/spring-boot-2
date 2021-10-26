package com.example.springboot2.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class TestEntity {
    @Id
    private int id;
    private String name;
    private String address;

    public TestEntity(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public TestEntity() {
    }
}
