package com.getechnologies.facturas.service;

import com.getechnologies.facturas.dominio.Factura;
import com.getechnologies.facturas.dominio.Persona;
import com.getechnologies.facturas.repository.FacturaRepository;
import com.getechnologies.facturas.repository.PersonaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DirectorioService {
    @Autowired
    private PersonaRepository personaRepository;
    @Autowired
    private FacturaRepository facturaRepository;
    @Transactional
    public void deletePersonaByIdentificacion(String identificacion) {
        Persona persona = personaRepository.findByIdentificacion(identificacion);
        if (persona != null) {
            facturaRepository.deleteByPersona_Id(persona.getId());
            personaRepository.delete(persona);
        }
    }

    @Transactional
    public Persona findPersonaByIdentificacion(String identificacion) {
        return personaRepository.findByIdentificacion(identificacion);
    }

    @Transactional
    public List<Persona> getAllPersonas() {
        return personaRepository.findAll();
    }
}