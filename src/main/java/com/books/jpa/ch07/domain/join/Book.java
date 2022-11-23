package com.books.jpa.ch07.domain.join;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@DiscriminatorValue("B")
@PrimaryKeyJoinColumn(name = "BOOK_ID") // ID 재정의
/*
    자식 테이블의 기본키 컬럼명 변경은 @PrimaryKeyJoinColumn 사용 ( 기본값은 부모 기본키 )
 */
public class Book extends Item {

    private String author;
    private String isbn;

}
