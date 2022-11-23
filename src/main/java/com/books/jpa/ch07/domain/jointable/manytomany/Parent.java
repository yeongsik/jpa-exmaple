package com.books.jpa.ch07.domain.jointable.manytomany;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

// 다대다 조인 테이블 매핑
@Entity
public class Parent {

    @Id @GeneratedValue
    @Column(name = "PARENT_ID")
    private Long id;
    private String name;

    @ManyToMany
    @JoinTable(name = "PARENT_CHILD",
            joinColumns = @JoinColumn(name = "PARENT_ID"),
            inverseJoinColumns = @JoinColumn(name = "CHILD_ID")
    )
    private List<Child> child = new ArrayList<>();

}
