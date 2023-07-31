package com.bookstore.service.imp;

import com.bookstore.model.Seller;
import com.bookstore.repository.SellerRepository;
import com.bookstore.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SellerServiceImp implements SellerService {

    @Autowired
    private SellerRepository sellerRepository;
    @Override
    public void saveBook(Seller seller) {
        sellerRepository.save(seller);

    }
}
