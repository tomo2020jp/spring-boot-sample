package com.tomo.spring.boot.sample.application;

import com.tomo.spring.boot.sample.domain.Book;
import com.tomo.spring.boot.sample.domain.BookId;
import com.tomo.spring.boot.sample.domain.BookRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class BookController {

    private BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @PostMapping
    public Book save(@RequestBody Book book) {
        bookRepository.save(book);
        return book;
    }

    @GetMapping
    public Book findById(@RequestParam UUID id) {
        return bookRepository.findById(new BookId(id));
    }

    @GetMapping
    public List<Book> find() {
        return bookRepository.find();
    }

    @PutMapping
    public Book update(@RequestBody Book book) {
        bookRepository.update(book);
        return book;
    }

    @DeleteMapping
    public BookId delete(@RequestParam UUID id) {
        final var bookId = new BookId(id);
        bookRepository.delete(bookId);
        return bookId;
    }
}
