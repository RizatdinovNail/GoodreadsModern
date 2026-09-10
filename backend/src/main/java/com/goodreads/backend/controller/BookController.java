package com.goodreads.backend.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {
    @GetMapping
    public List<String> getSampleBooks(){
        return List.of("The Hobbit", "1984", "Dune");
    }
}
