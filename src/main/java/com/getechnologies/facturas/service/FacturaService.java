package com.getechnologies.facturas.service;

import com.getechnologies.facturas.dominio.Factura;
import com.getechnologies.facturas.dominio.Persona;
import com.getechnologies.facturas.repository.FacturaRepository;
import com.getechnologies.facturas.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
@Service
public class FacturaService {

    @Autowired
    private PersonaRepository personaRepository;
    @Autowired
    private FacturaRepository facturaRepository;
    public List<Factura> findFacturasByPersona(Long id){
       return facturaRepository.findByPersona_id(id);
    }
    public Factura storeFactura(double monto,Long personaId){
        Optional<Persona> personaOpt = personaRepository.findById(personaId);
        Persona persona = personaOpt.orElseThrow();

        Factura factura = new Factura();
        factura.setMonto(monto);
        factura.setFecha(LocalDateTime.now());
        factura.setPersona(persona);

        return facturaRepository.save(factura);
    }

}
