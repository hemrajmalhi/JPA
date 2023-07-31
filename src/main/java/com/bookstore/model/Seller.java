package com.bookstore.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "Seller_Detail")
public class Seller {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String sellerName;
    private String seller_location;
    private String  sellerNumber;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "seller")
    private List<Book> book;



}
