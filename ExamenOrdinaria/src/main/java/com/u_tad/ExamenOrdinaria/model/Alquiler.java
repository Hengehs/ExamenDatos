package com.u_tad.ExamenOrdinaria.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "alquiler")
public class Alquiler {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(mappedBy = "id")
    private Usuario aura_userId;

    @OneToOne(mappedBy = "id")
    private Coche aura_coche;

    @Column
    private LocalDateTime rentalDate;

    @Column(nullable = true)
    private LocalDateTime returnDate;

    @Enumerated(EnumType.STRING)
    private Status status;
}

