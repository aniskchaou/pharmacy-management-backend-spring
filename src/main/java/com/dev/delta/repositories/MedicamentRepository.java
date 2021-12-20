package com.dev.delta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.dev.delta.entities.Medicament;
import com.dev.delta.entitiesi18n.MedicamentI18n;
@RepositoryRestResource
public interface MedicamentRepository extends JpaRepository<Medicament, Long>  {


}
