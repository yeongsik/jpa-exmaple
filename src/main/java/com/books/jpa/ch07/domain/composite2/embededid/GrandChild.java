package com.books.jpa.ch07.domain.composite2.embededid;

import javax.persistence.*;

@Entity
public class GrandChild {

    @EmbeddedId
    private GrandChildId id;

    @MapsId("childId")
    @ManyToOne
    @JoinColumns({
            @JoinColumn(name = "PARENT_ID"),
            @JoinColumn(name ="CHILD_ID")
    })
    private Child childId;

    private String name;

}
