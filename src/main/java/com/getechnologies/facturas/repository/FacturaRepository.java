package com.getechnologies.facturas.repository;

import com.getechnologies.facturas.dominio.Factura;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FacturaRepository extends JpaRepository<Factura, Long> {
    List<Factura> findByPersona_id(Long id);
}
