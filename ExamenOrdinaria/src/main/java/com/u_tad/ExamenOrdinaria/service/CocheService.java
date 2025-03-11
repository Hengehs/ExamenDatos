package com.u_tad.ExamenOrdinaria.service;

import com.u_tad.ExamenOrdinaria.model.Coche;
import com.u_tad.ExamenOrdinaria.repository.CocheRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CocheService {
    @Autowired
    CocheRepository cocheRepository;

    public List<Coche> getCoches() {return cocheRepository.findAll();}
    public Optional<Coche> getCocheById(Long id) {return cocheRepository.findById(id);}
    public Coche saveOrUpdate(Coche coche) {return cocheRepository.save(coche);}
    public void deleteCoche(Long id) {cocheRepository.deleteById(id);}
}
