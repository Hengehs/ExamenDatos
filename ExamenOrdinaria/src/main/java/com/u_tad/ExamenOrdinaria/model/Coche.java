package com.u_tad.ExamenOrdinaria.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import org.hibernate.annotations.ColumnDefault;

@Data
@Entity
@Table(name = "coche")
public class Coche {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String plateNumber;

    @Column(nullable = false)
    private String brand;
    private String model;
    private Integer year;
    private Double hoyos_gasPercentage;

    @Getter
    @ColumnDefault("true")
    private Boolean available;
}
