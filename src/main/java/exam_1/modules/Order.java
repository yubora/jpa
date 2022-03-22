package exam_1.modules;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "orders")
@Data
public class Order {

    @Id
    @GeneratedValue
    @Column(name = "order_id")
    private Long id;

    private Long memberId;

    @Column(name = "orderdate")
    private LocalDateTime date;

    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;
}
