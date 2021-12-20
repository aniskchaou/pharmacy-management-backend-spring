package com.dev.delta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.dev.delta.entities.Supplier;
import com.dev.delta.entitiesi18n.SupplierI18n;
@RepositoryRestResource
public interface SupplierRepository extends JpaRepository<Supplier, Long>  {


}
