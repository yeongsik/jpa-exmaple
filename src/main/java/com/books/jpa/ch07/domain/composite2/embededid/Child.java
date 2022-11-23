package com.books.jpa.ch07.domain.composite2.embededid;


import javax.persistence.*;

@Entity
public class Child {

    @EmbeddedId
    private ChildId id;

    @MapsId("parentId") // ChildId.parentId 매핑
    @ManyToOne
    @JoinColumn(name = "PARENT_ID")
    private Parent parent;

    private String name;

}
