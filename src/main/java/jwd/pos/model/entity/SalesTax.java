package jwd.pos.model.entity;

import jakarta.persistence.*;

@Entity
public class SalesTax {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (nullable = false)
    private double tax_amount;

}
