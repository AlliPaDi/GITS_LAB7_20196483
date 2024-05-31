package com.example.gtics_lab7_20196483.entity;


        import jakarta.persistence.*;
        import lombok.Getter;
        import lombok.Setter;

@Entity
@Table(name = "resources")
@Getter
@Setter
public class Resources {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "resourceID", nullable = false)
    private Integer id;

    @Column(name = "productName", nullable = false, length = 40)
    private String productName;


}