package com.books.jpa.example;

import com.books.jpa.example.DateBaseEntity;
import com.books.jpa.example.Member;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Adress extends DateBaseEntity {

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

