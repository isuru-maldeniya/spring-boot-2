package com.example.springboot2.controller;

import com.example.springboot2.dto.TestDTO;
import com.example.springboot2.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "conn")
public class TestController {

    @Autowired
    private TestService service;

    @PostMapping(value = "/adduser")
    public ResponseEntity<TestDTO> addTest(@RequestBody TestDTO dto){
        System.out.println("hello in");
        return new ResponseEntity<>(service.addTest(dto), HttpStatus.OK);
    }

}
