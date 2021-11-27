package com.example.borrow_book.repository;

import com.example.borrow_book.model.CardBorrow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICardBorrowRepository extends JpaRepository<CardBorrow, Integer > {
}