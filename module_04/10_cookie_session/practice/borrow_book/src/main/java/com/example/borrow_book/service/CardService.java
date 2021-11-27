package com.example.borrow_book.service;

import com.example.borrow_book.model.Book;
import com.example.borrow_book.model.CardBorrow;
import com.example.borrow_book.repository.IBookRepository;
import com.example.borrow_book.repository.ICardBorrowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CardService implements ICardService {
    @Autowired
    ICardBorrowRepository cardBorrowRepository;
    @Autowired
    IBookRepository bookRepository;
    @Override
    public Iterable< CardBorrow > findAll() {
        return cardBorrowRepository.findAll();
    }

    @Override
    public Optional< CardBorrow > findById(Integer id) {
        return cardBorrowRepository.findById(id);
    }

    @Override
    public void save(CardBorrow cardBorrow) {
        cardBorrowRepository.save(cardBorrow);
    }

    @Override
    public void remove(Integer id) {
        cardBorrowRepository.deleteById(id);
    }

    @Override
    public void addBorrow(CardBorrow cardBorrow) {

    }

    @Override
    public Boolean returnBook(Book book, int code) {
        List<CardBorrow> cardBorrowList = (List<CardBorrow>) cardBorrowRepository.findAll();
        if(!cardBorrowList.isEmpty()) {
            for (CardBorrow cardBorrow : cardBorrowList) {
                if (cardBorrow.getCode() == code){
                    cardBorrowRepository.deleteById(cardBorrow.getId());
                    book.setNumber(book.getNumber()+1);
                    bookRepository.save(book);
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
