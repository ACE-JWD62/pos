package jwd.pos.model.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "tbl_discount")
public class Discount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String discount_code;

    @Column(nullable = false)
    private double discount_value;

    @Column(nullable = false)
    private Date valid_from;

    @Column(nullable = false)
    private Date valid_until;

    @OneToMany(mappedBy = "discount", fetch = FetchType.LAZY)
    private Set<MenuItemDiscount> menuItemDiscounts;

    @PostPersist
    private void updateDiscountCode() {
        LocalDate now = LocalDate.now();
        this.discount_code = String.format("DIS%02d%02d%04d",
                now.getYear() % 100,
                now.getMonthValue(),
                this.id);
    }

}
