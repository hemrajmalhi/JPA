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
@Table(name = "Buyer_Details")
public class Buyer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int buyerId;
    private String name;
    private String address;
    private String number;
    @Column(name = "email_address", unique = true)
    private String gmail;
    private String region;
    @OneToMany(mappedBy = "buyer",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Book> book;


}
