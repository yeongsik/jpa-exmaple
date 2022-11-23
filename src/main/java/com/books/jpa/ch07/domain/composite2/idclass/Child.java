package com.books.jpa.ch07.domain.composite2.idclass;

import javax.persistence.*;

@Entity
@IdClass(ChildId.class)
public class Child {

    @Id
    @ManyToOne
    @JoinColumn(name = "PARENT_ID")
    public Parent parent;

    @Id @Column(name = "CHILD_ID")
    private String childId;

    private String name;
}
