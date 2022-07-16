package com.tomo.spring.boot.sample.domain;

public class Book {

    private final BookId bookId;
    private final Name name;
    private final Price price;

    public Book(BookId bookId, Name name, Price price) {
        this.bookId = bookId;
        this.name = name;
        this.price = price;
    }
}
