package com.books.jpa.example.item;

import com.books.jpa.example.CategoryItem;
import com.books.jpa.example.DateBaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn
public abstract class Item extends DateBaseEntity {

    @Id @GeneratedValue
    @Column(name = "ITEM_ID")
    private Long id;

    @OneToMany(mappedBy = "item")
    private List<CategoryItem> categoryItems;

    private String name;

    private Integer price;

    private Integer stockQuantity;

}
