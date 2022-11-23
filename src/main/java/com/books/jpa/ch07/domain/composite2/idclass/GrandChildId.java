package com.books.jpa.ch07.domain.composite2.idclass;

import java.io.Serializable;

public class GrandChildId implements Serializable {

    private ChildId child;
    private String grandChildId;

    //equals , hashCode
}
