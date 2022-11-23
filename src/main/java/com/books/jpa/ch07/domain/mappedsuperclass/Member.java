package com.books.jpa.ch07.domain.mappedsuperclass;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@AttributeOverride(name = "id", column = @Column(name = "MEMBER_ID"))
// BaseEntity에 있는 id 속성 컬럼명을 MEMBER_ID로 재설정
public class Member extends BaseEntity{

    //ID 상속
    //NAME 상속
    private String email;
}
