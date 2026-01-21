package com.gabrieldev.apiVendas.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class teste {
    @GetMapping("/msg/{id}")
    public String teste(@PathVariable int id){
        return "id: " + id;
    }
}
