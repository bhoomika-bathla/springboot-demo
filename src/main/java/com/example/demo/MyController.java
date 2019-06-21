package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book")
public class MyController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping(value="/search/{name}")
    public List<Book> search(@PathVariable("name") String name) {
        List<Book> books = bookRepository.findByName(name);
        return books;
    }
}
