package com.br.internet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.internet.entites.Clientes;

public interface ClienteRepository extends JpaRepository<Clientes, Long> {

}
