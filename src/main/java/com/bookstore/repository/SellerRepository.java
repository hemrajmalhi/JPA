package com.bookstore.repository;

import com.bookstore.model.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface   SellerRepository extends JpaRepository<Seller,Integer> {

}
