package com.getechnologies.facturas.service;

import com.getechnologies.facturas.dominio.Persona;
import com.getechnologies.facturas.repository.PersonaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

import java.util.List;

@Service
public class DirectorioService {
    @Autowired
    private PersonaRepository personaRepository;

    @Transactional
    public Persona findPersonaByIdentificacion(String identificacion) {
        return personaRepository.findByIdentificacion(identificacion);
    }
    @Transactional
    public List<Persona> getAllPersonas() {
        return personaRepository.findAll();
    }

}
