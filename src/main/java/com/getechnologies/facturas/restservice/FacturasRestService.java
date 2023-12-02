package com.getechnologies.facturas.restservice;
import com.getechnologies.facturas.dominio.Factura;
import com.getechnologies.facturas.service.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/factura-api")
public class FacturasRestService {
    @Autowired
    private FacturaService facturaService;
    @GetMapping("/facturas/persona/{personaId}")
    public List<Factura> findFacturasByPersona(@PathVariable Long personaId){
        return facturaService.findFacturasByPersona(personaId);


    }

}