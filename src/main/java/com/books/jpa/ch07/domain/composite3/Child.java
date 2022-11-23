package com.books.jpa.ch07.domain.composite3;

import com.books.jpa.ch07.domain.composite2.embededid.Parent;

import javax.persistence.*;

@Entity
public class Child {

    @Id @GeneratedValue
    @Column(name = "CHILD_ID")
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "PARENT_ID")
    private Parent parent;
}
