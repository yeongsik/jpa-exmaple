package com.books.jpa.ch07.domain.composite.embededid;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Parent {

    @EmbeddedId
    private ParentId id;

    private String name;
}
