package com.u_tad.ExamenOrdinaria.service;

import com.u_tad.ExamenOrdinaria.model.Alquiler;
import com.u_tad.ExamenOrdinaria.repository.AlquilerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlquilerService {
    @Autowired
    AlquilerRepository alquilerRepository;

    public List<Alquiler> getAlquileres() {return alquilerRepository.findAll();}
    public Alquiler saveOrUpdate(Alquiler alquiler) {return alquilerRepository.save(alquiler);}
    public void deleteAlquiler(Long id) {alquilerRepository.deleteById(id);}
}
