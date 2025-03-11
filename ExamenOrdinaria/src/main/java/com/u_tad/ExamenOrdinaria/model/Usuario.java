package com.u_tad.ExamenOrdinaria.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String username;
    private String email;
    private String licenseNumber;

    @Column(nullable = false)
    private int ahs_age;

    @OneToMany(mappedBy = "id")
    private List<Alquiler> ahs_idAlquiler;

}
