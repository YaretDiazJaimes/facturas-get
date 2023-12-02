package com.getechnologies.facturas.repository;

import com.getechnologies.facturas.dominio.Factura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacturaRepository extends JpaRepository<Factura, Long> {
}
