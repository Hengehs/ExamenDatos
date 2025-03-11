package com.u_tad.ExamenOrdinaria.repository;

import com.u_tad.ExamenOrdinaria.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
