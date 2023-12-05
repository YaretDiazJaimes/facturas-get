package com.getechnologies.facturas.repository;

import com.getechnologies.facturas.dominio.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PersonaRepository extends JpaRepository<Persona,Long> {
    Persona findByIdentificacion(String identificacion);

}
