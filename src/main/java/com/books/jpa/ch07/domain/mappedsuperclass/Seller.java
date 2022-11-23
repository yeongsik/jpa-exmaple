package com.books.jpa.ch07.domain.mappedsuperclass;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@AttributeOverrides({
        @AttributeOverride(name = "id", column = @Column(name = "SELLER_ID")),
        @AttributeOverride(name = "name", column = @Column(name ="SELLER_NAME"))
// 여러 속성을 재설정 하려면 Overrides 안에 Override 설정

})
public class Seller extends BaseEntity {

    //ID 상속
    //NAME 상속

    private String shopName;
}
