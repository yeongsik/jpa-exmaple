package com.books.jpa.ch07.domain.composite2.embededid;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class GrandChildId implements Serializable {

    private ChildId childId;

    @Column(name = "GRAND_CHILD_ID")
    private String id;

    // equals , hashCode
}
