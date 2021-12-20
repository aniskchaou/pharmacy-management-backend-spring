package com.dev.delta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.dev.delta.entitiesi18n.TypeMedicamentI18n;
@RepositoryRestResource
public interface TypeRepository extends JpaRepository<com.dev.delta.entities.TypeMedicament, Long>  {


}
