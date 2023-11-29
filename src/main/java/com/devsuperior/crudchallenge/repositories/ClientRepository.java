package com.devsuperior.crudchallenge.repositories;

import com.devsuperior.crudchallenge.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
