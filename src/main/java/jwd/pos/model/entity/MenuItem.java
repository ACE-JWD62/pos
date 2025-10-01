package jwd.pos.model.entity;

import jakarta.persistence.*;
import lombok.Builder;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "tbl_menu_item")
@Builder
public class MenuItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String menuName;


    @Column(nullable = false)
    private double price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_category_id", nullable = false)
    private Category category;

    private String imageUrl;

    private boolean isThereDiscount = false;

    private String description;

    @Column(nullable = false)
    private LocalDate created_date;

    private LocalDate updated_date;

    private String created_by;

    @OneToMany(mappedBy = "menuItem", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<MenuItemDiscount> menuItemDiscounts;

    @PrePersist
    private void setCreated_date(){
        this.created_date = LocalDate.now();
    }

}
