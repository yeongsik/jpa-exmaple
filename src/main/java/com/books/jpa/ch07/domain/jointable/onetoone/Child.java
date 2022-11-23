package com.books.jpa.ch07.domain.jointable.onetoone;

import javax.persistence.*;

@Entity
public class Child {

    @Id @GeneratedValue
    @Column(name = "CHILD_ID")
    private Long id;
    private String name;

    // 양방향 매핑
    @OneToOne(mappedBy = "child")
    private Parent parent;
}
