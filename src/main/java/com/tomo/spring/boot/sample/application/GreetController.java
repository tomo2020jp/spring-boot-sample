package com.tomo.spring.boot.sample.application;

import com.tomo.spring.boot.sample.domain.Book;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetController {

    @PostMapping
    public Book save(@RequestBody Book book) {
        return book;
    }

    @GetMapping
    public Book get() {
        return new Book("test", 100);
    }
}
