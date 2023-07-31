package com.bookstore.repository;

import com.bookstore.model.Buyer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BuyerRepository extends JpaRepository<Buyer,Integer> {

}
