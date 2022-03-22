package exam_1.modules;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Item {

    @Id
    @GeneratedValue
    @Column(name = "itme_id")
    private Long id;

    private String name;

    private int price;

    private int stockQty;
}
