package com.example.borrow_book.service;

import com.example.borrow_book.model.Book;
import com.example.borrow_book.model.CardBorrow;

public interface ICardService extends IGeneralService< CardBorrow > {
    public Boolean returnBook(Book book, int code);
}