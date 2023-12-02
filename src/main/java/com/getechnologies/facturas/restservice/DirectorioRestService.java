package com.getechnologies.facturas.restservice;

import com.getechnologies.facturas.dominio.Factura;
import com.getechnologies.facturas.dominio.Persona;
import com.getechnologies.facturas.service.DirectorioService;
import com.getechnologies.facturas.service.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/directorio-api")
public class DirectorioRestService {
    @Autowired
    private DirectorioService directorioService;

    @GetMapping("/directorio/persona/{identificacion}")
    public Persona findPersonaByIdentificacion(@PathVariable String identificacion){
        return directorioService.findPersonaByIdentificacion(identificacion);
    }

}
