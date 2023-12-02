package com.getechnologies.facturas.service;

import com.getechnologies.facturas.dominio.Factura;
import com.getechnologies.facturas.dominio.Persona;
import com.getechnologies.facturas.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class FacturaService {

    @Autowired
    private PersonaRepository personaRepository;
    public List<Factura> findFacturasByPersona(Long id){
       Optional<Persona>personaOpt= personaRepository.findById(id);
       Persona persona=personaOpt.orElseThrow();
       return persona.getFacturas();
    }
}
