package com.books.jpa.example;

import javax.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass
public class DateBaseEntity {

    private Date createdDate;

    private Date lastModifiedDate;


}
