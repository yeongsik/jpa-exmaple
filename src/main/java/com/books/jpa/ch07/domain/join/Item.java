package com.books.jpa.ch07.domain.join;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED) // 상속 매핑 때 사용 매핑 전략을 지정해줘야한다.
@DiscriminatorColumn(name = "DTYPE") // 부모 클래스에 구분 컬럼을 지정 - 기본값 DTYPE이므로 @DiscriminatorColumn 만 사용해도 된다.
public abstract class Item {

    @Id @GeneratedValue
    @Column (name = "ITEM_ID")
    private Long id;

    private String name;
    private int price;
}
