package com.books.jpa.ch07.domain.jointable.onetomany;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

// 조인 테이블 일대다 관계 ( 단방향 )
@Entity
public class Parent {

    @Id @GeneratedValue
    @Column(name = "PARENT_ID")
    private Long id;
    private String name;

    @OneToMany
    @JoinTable(name = "PARENT_CHILD",
            joinColumns = @JoinColumn(name = "PARENT_ID"),
            inverseJoinColumns = @JoinColumn(name = "CHILD_ID")
    )
    private List<Child> child = new ArrayList<>();

}
