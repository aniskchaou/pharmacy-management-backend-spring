package com.dev.delta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.dev.delta.entities.Buy;
import com.dev.delta.entitiesi18n.BuyI18n;
@RepositoryRestResource
public interface BuyRepository extends JpaRepository<Buy, Long>  {


}
