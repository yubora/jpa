package basic;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // 프로젝트 로딩시 한번만 생성
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa_dev");
        // 트랜잭션 단위마다 생성
        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
            //member 저장
            Member member = new Member();
            member.setId(2L);
            member.setName("doggy");
            em.persist(member);

            //member 조회
            Member findMember = em.find(Member.class, 1L);

            //member 수정
            findMember.setName("helloKitty"); //멤버변경 후, 다시 저장하지 않아도 update쿼리 실행됨 (jpa가 관리하기 때문, 마치 Java Collection처럼)


            //JPQL을 이용한 다건 조회
            List<Member> result = em.createQuery("select m from Member m", Member.class).getResultList();
            System.out.println(Arrays.toString(new List[]{result}));



            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close(); //EntityManager가 dbConnection을 물고 동작하기 때문에 한 트랜잭션이 끝나면 꼭 닫아줘야함
        }
        emf.close();
    }
}
