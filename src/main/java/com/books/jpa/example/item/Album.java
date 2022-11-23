package com.books.jpa.example.item;

import com.books.jpa.example.item.Item;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("A")
public class Album extends Item {

    private String artist;
    private String etc;
}
