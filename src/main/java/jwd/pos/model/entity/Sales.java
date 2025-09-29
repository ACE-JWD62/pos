package jwd.pos.model.entity;

import jakarta.persistence.*;

import java.util.Set;
@Entity
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

}
