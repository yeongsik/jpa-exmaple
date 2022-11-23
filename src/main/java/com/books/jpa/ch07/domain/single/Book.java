package com.books.jpa.ch07.domain.single;

import org.springframework.lang.Nullable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("B")
public class Book extends Item{

    private String author;
    private String isbn;

}
