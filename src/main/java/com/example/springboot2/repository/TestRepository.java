package com.example.springboot2.repository;

import com.example.springboot2.entity.TestEntity;
import org.springframework.data.repository.CrudRepository;

public interface TestRepository extends CrudRepository<TestEntity,Integer> {
}
