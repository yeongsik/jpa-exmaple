package com.books.jpa.ch07.domain.composite4;

import javax.persistence.*;

@Entity
public class BoardDetail {

    @Id
    private Long boardId;

    @MapsId //BoardDetail.boardId 매핑
    @OneToOne
    @JoinColumn(name="BOARD_ID")
    private Board board;

    private String content;
}
