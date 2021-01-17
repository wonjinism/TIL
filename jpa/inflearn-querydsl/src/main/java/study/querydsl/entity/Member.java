package study.querydsl.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter @Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString(of = {"id", "username", "age"})
public class Member {

    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;
    private String username;
    private int age;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "teatm_id")
    private Team team;


    public Member(String username) {
        this(username, 0);
    }

    public Member(String username, int age) {
        this(username, age, null);
    }

    public Member(String username, int age, Team team) {
        this.username = username;
        this.age = age;
        if (team != null) {
            changeTema(team);
        }
    }

    private void changeTema(Team team) {
        this.team = team;
        team.getMembers().add(this);
    }
}
