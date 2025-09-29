package jwd.pos.model.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;
@Entity
public class Tax {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String tax_name;

    @Column (nullable = false)
    private double tax_rate;

    @Column (nullable = false)
    private Date start_date;

    @Column (nullable = false)
    private Date end_date;



}
