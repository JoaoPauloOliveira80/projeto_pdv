package com.joaopaulo.fanaticos_sistema_pdv.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaopaulo.fanaticos_sistema_pdv.model.Clientes;

public interface ClienteRepository extends JpaRepository<Clientes, Long> {

}
