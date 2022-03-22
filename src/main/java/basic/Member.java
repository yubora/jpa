package basic;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

//@Table(name = "USER") 테이블명과 클래스명이 다를 경우 @Table annotation 사용
// (컬럼이 다를경우는 @Column)
@Data
//@Entity
public class Member {

    @Id //jpa에게 pk를 알려줘야함
    private Long id;
    private String name;
}
