package com.books.jpa.ch07.domain.composite2.embededid;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

// 복합키 식별관계 구현 @EmbededId 사용
@Entity
public class Parent {

    @Id @Column(name = "PARENT_ID")
    private String id;

    private String name;
}
