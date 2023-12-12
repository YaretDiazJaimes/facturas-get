package com.getechnologies.facturas.restservice;

import com.getechnologies.facturas.dominio.Persona;
import com.getechnologies.facturas.service.DirectorioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/directorio-api")
public class DirectorioRestService {
    @Autowired
    private DirectorioService directorioService;

    @GetMapping("/directorio/persona/{identificacion}")
    public Persona findPersonaByIdentificacion(@PathVariable String identificacion){
        return directorioService.findPersonaByIdentificacion(identificacion);
    }
    @GetMapping("/directorio/personas")
    public List<Persona> getAllPersonas() {
        return directorioService.getAllPersonas();
    }
    @DeleteMapping("/directorio/persona/{identificacion}")
    public ResponseEntity<String> deletePersonaByIdentificacion(@PathVariable String identificacion) {
        directorioService.deletePersonaByIdentificacion(identificacion);
        return ResponseEntity.ok("Persona y facturas eliminadas correctamente");
    }
    @PostMapping("/directorio/persona")
    public ResponseEntity<String> storePersona(@RequestBody Persona persona){
        directorioService.storePersona(persona);
        return ResponseEntity.ok("Persona creada correctamente");
    }

}
