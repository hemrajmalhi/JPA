package com.bookstore.service.imp;

import com.bookstore.model.Book;
import com.bookstore.repository.BookRepository;
import com.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BookServiceImp implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public Book saveBook(Book book) {
        System.out.println(book);
        return bookRepository.save(book);
    }

    @Override
    public List<Book> getBook() {
        return bookRepository.findAll();
    }

    @Override
    public void updateUser(int id, Book book) {
        book.setId(id);
        bookRepository.save(book);
    }


}
