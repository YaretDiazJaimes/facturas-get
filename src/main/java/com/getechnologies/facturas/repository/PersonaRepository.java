package com.getechnologies.facturas.repository;

import com.getechnologies.facturas.dominio.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona,Long> {
}
