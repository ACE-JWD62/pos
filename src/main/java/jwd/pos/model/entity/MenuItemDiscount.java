package jwd.pos.model.entity;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "tbl_menu_item_discount")
public class MenuItemDiscount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_menu_id",nullable = false)
    private MenuItem menuItem;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_discount_id", nullable = false)
    private Discount discount;


    @Column(nullable = false)
    private Date createdDate;

    @Column(nullable = false)
    private String createdBy;
}
