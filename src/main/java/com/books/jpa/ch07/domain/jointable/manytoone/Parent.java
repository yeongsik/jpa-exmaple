package com.books.jpa.ch07.domain.jointable.manytoone;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

// 일대다 , 다대일 양방향 관계 매핑
@Entity
public class Parent {

    @Id @GeneratedValue
    @Column(name = "PARENT_ID")
    private Long id;

    @OneToMany(mappedBy = "parent")
    private List<Child> child = new ArrayList<>();
}
