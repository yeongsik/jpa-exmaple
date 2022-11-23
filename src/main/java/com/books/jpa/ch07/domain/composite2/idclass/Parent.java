package com.books.jpa.ch07.domain.composite2.idclass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

// 복합키 식별관계 구현 @IdClass 사용
@Entity
public class Parent {

    @Id @Column(name = "PARENT_ID")
    private String id;
    private String name;
}
