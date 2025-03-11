package com.u_tad.ExamenOrdinaria.service;

import com.u_tad.ExamenOrdinaria.model.Usuario;
import com.u_tad.ExamenOrdinaria.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    public List<Usuario> getUsuarios() { return usuarioRepository.findAll(); }
    public Usuario saveOrUpdate (Usuario usuario) { return usuarioRepository.save(usuario); }
    public void deleteUsuario (Long id) {usuarioRepository.deleteById(id);}

}
