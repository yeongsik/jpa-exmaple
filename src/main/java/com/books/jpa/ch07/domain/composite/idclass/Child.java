package com.books.jpa.ch07.domain.composite.idclass;

import javax.persistence.*;

@Entity
public class Child {

    @Id
    private Long id;

    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "PARENT_ID1", referencedColumnName = "PARENT_ID1"),
            @JoinColumn(name = "PARENT_ID2", referencedColumnName = "PARENT_ID2")
    })
    /*
        외래키 매핑시 여러 컬럼을 매핑해야 되므로 @JoinColumns 사용
     */
    private Parent parent;
}
