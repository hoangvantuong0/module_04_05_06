package com.example.borrow_book.service;


import com.example.borrow_book.model.Book;
import com.example.borrow_book.model.CardBorrow;
import com.example.borrow_book.model.Status;
import com.example.borrow_book.repository.IBookRepository;
import com.example.borrow_book.repository.ICardBorrowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Random;

@Service
public class BookService implements IBookService {
    @Autowired
    IBookRepository bookRepository;
    @Autowired
    ICardBorrowRepository cardBorrowRepository;

    @Override
    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Optional< Book > findById(Integer id) {
        return bookRepository.findById(id);
    }

    @Override
    public void save(Book book) {
        bookRepository.save(book);
    }

    public void addBorrow(Book book) {
        Status status = new Status();
        status.setId(1);
        CardBorrow cardBorrow = new CardBorrow();
        int n = 10000 + new Random().nextInt(9000);
        cardBorrow.setBook(book);
        cardBorrow.setStatus(status);
        cardBorrow.setCode(n);
        System.out.println(cardBorrow);
        cardBorrowRepository.save(cardBorrow);
    }

    @Override
    public void remove(Integer id) {
        bookRepository.deleteById(id);
    }
}