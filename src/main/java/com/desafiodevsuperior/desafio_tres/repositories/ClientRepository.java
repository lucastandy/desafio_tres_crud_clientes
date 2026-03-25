package com.desafiodevsuperior.desafio_tres.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafiodevsuperior.desafio_tres.entities.Client;


public interface ClientRepository extends JpaRepository<Client, Long> {

}
