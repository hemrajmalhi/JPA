package com.bookstore.service.imp;


import com.bookstore.model.Buyer;
import com.bookstore.repository.BuyerRepository;
import com.bookstore.service.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BuyerServiceImp implements BuyerService {
    @Autowired
    private BuyerRepository buyerRepository;

    @Override
    public void saveBook(Buyer buyer) {
        buyerRepository.save(buyer);
    }
}
