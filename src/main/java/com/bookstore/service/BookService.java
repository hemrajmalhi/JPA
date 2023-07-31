package com.bookstore.service;

import com.bookstore.model.Book;

import java.util.List;

public interface BookService {
    public Book saveBook(Book book);

    public List<Book> getBook();

    public void updateUser(int id, Book book);
}
