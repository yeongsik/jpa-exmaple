package com.books.jpa.ch05;

public class Main5_2 {
    public static void main(String[] args) {
        // 순수한 객체 연관관계

        //생성자 ( id, 이름 )
        Member member1 = new Member("member1", "회원1");
        Member member2 = new Member("member2", "회원2");

        Team team1 = new Team("team1", "팀1");

        member1.setTeam(team1);
        member2.setTeam(team1);

        Team findTeam = member1.getTeam(); // 객체 그래프 탐색 ( 단방향 )

        /*
            데이터베이스에서는 외래키를 통한 조인으로 연관관계인 테이블들의 데이터를 조회할 수 있다. ( 양방향 )
         */
    }
}
