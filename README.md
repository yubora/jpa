# JPA [![Velog Badge](https://img.shields.io/badge/JPA_study-20C997?style=flat-square&logo=Velog&logoColor=white&link=to:https://velog.io/@purple/series/JPA)](https://velog.io/@purple/series/JPA)

JPA study

## 📚 실전예제1
### 데이터 중심 설계의 문제점
|Entity|Table|
|:-:|:-:|
|![entity](/src/main/resources/image/entity.png)|![table](/src/main/resources/image/table.png)|

>객체에서 테이블의 외래키 방식을 그대로 사용하다 보니<br>
객체 그래프 탐색이 불가능하고, 참조가 없으므로 UML도 잘못된 것이다.


## 📚 실전예제2
### 객체 지향적 설계
|Entity|Table|
|:-:|:-:|
|![entity](/src/main/resources/image/new_entity.png)|![table](/src/main/resources/image/table.png)|

> 객체간 참조를 통해 양방향 연관관계를 맺었다. 때문에 객체 그래프 탐색이 가능해진다.<br> - @ManyToOne : N:1의 관계<br> - @OneToMany : 1:N의 관계
