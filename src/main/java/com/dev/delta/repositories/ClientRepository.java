package com.dev.delta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.dev.delta.entities.Client;
import com.dev.delta.entitiesi18n.ClientI18n;
@RepositoryRestResource
public interface ClientRepository extends JpaRepository<Client, Long>  {


}
