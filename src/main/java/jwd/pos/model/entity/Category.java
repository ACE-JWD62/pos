package jwd.pos.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "tbl_category")
@NoArgsConstructor
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String categoryName;

    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY)
    private Set<MenuItem> menus;
}
