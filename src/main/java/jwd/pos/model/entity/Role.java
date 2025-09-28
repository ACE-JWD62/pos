package jwd.pos.model.entity;


import jakarta.persistence.*;
import org.hibernate.annotations.IdGeneratorType;

@Entity
@Table(name = "tbl_roles")
public class Role {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private jwd.pos.constant.Role name;
}
