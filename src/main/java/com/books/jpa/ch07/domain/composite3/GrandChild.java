package com.books.jpa.ch07.domain.composite3;

import javax.persistence.*;

@Entity
public class GrandChild {

    @Id @GeneratedValue
    @Column(name = "GRAND_CHILD_ID")
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "CHILD_ID")
    private Child child;
}
