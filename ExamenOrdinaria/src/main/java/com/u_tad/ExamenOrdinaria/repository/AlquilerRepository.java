package com.u_tad.ExamenOrdinaria.repository;

import com.u_tad.ExamenOrdinaria.model.Alquiler;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlquilerRepository  extends JpaRepository<Alquiler, Long> {
}
