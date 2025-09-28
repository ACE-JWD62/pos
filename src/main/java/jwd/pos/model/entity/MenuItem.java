    package jwd.pos.model.entity;

    import jakarta.persistence.*;

    import java.util.Date;
    import java.util.Set;

    @Entity
    @Table(name = "tbl_menu_item")
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

        private boolean isThereDiscount;

        private String description;

        private Date creaetd_date;

        private Date updated_date;

        private String created_by;

        @OneToMany(mappedBy = "menuItem", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
        private Set<MenuItemDiscount> menuItemDiscounts;
    }
