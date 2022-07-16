package com.tomo.spring.boot.sample.domain;

import java.util.List;

public interface BookRepository {

    void save(Book book);

    Book findById(BookId bookId);

    List<Book> find();

    void update(Book book);

    void delete(BookId bookId);
}
