package com.books.jpa.ch07.domain.composite2.embededid;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ChildId implements Serializable {

    private String parentId; //@MapsId("parentId")로 매핑

    @Column(name = "CHILD_ID")
    private String id;

    // equals , hashCode

}
