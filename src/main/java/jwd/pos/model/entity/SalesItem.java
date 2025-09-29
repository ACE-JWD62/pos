package jwd.pos.model.entity;

import jakarta.persistence.*;

@Entity
public class SalesItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private int quantity;

    @Column(nullable = false)
    private double price;

    @Column(nullable = false)
    private double total;
}
