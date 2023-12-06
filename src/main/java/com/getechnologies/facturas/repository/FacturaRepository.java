package com.getechnologies.facturas.repository;

import com.getechnologies.facturas.dominio.Factura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FacturaRepository extends JpaRepository<Factura, Long> {
    List<Factura> findByPersona_id(Long id);
    void deleteByPersona_Id(Long id);

}
