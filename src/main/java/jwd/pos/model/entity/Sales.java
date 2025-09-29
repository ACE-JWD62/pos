package jwd.pos.model.entity;

import jakarta.persistence.*;

import java.util.Set;

public class Sales {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private int userId;

    @Column(nullable = false)
    private double totalAmount;

    @OneToMany(mappedBy = "sales", fetch = FetchType.LAZY)
    private Set<SalesItem> salesItems;

    @OneToMany(mappedBy = "sales", fetch = FetchType.LAZY)
    private Set<SalesTax> salesTax;
}
