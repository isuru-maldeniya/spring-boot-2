package com.example.springboot2.service;

import com.example.springboot2.dto.TestDTO;
import com.example.springboot2.entity.TestEntity;
import com.example.springboot2.repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    @Autowired
    private TestRepository repository;

    public TestDTO addTest(TestDTO dto){
        TestEntity save = repository.save(new TestEntity(dto.getName(), dto.getAddress()));
        return new TestDTO(save.getId(),save.getName(),save.getAddress());
    }
}
