package com.books.jpa.example;

import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
public class Adress {

    @Id
    @Column(name = "ADRESS_ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "MEMBER_ID")
    private Member member;

    private String city;

    private String street;

    private String zipCode;

}

