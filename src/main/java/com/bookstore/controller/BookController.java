package com.bookstore.controller;


import com.bookstore.model.Book;
import com.bookstore.model.Buyer;
import com.bookstore.model.Seller;
import com.bookstore.service.BookService;
import com.bookstore.service.BuyerService;
import com.bookstore.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
public class BookController {

    @Autowired
    private BookService bookService;
    @Autowired
    private SellerService sellerService;
    @Autowired

    private BuyerService buyerService;

    @GetMapping("/about")
    public String About(Model model) {
        model.addAttribute("message", "Hello Thymeleaf!");
        return "about";
    }


    @PostMapping("/save_book")
    public ResponseEntity<String> saveUser(@RequestBody Book book) {
        bookService.saveBook(book);
        return new ResponseEntity<>("User data saved successfully!", HttpStatus.OK);

    }

    @GetMapping("/get_book")
    public List<Book> getBook() {
        return bookService.getBook();
    }

    @PostMapping("/save_seller")
    public ResponseEntity<String> saveUser(@RequestBody Seller seller) {
        sellerService.saveBook(seller);
        return new ResponseEntity<>("User data saved successfully!", HttpStatus.OK);
    }

    @PostMapping("/save_buyer")
    public ResponseEntity<String> saveUser(@RequestBody Buyer buyer) {
        buyerService.saveBook(buyer);
        return new ResponseEntity<>("User data saved successfully!", HttpStatus.OK);

    }


    @PutMapping("/update_book/{id}")
    public ResponseEntity<String> updateUser(@PathVariable("id") int id, @RequestBody Book book) {
        this.bookService.updateUser(id, book);
        return new ResponseEntity<>("data is updated successfully",HttpStatus.OK);


    }

}