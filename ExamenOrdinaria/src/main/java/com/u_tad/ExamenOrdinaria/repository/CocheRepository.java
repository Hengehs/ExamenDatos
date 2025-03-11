package com.u_tad.ExamenOrdinaria.repository;

import com.u_tad.ExamenOrdinaria.model.Coche;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CocheRepository extends JpaRepository<Coche, Long> {
}
