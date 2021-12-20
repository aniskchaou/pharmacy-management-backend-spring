package com.dev.delta.repositories.i18n;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.dev.delta.entities.Supplier;
import com.dev.delta.entitiesi18n.SupplierI18n;
@RepositoryRestResource
public interface SupplierI18nRepositoryI18n extends JpaRepository<SupplierI18n, Long>  {

	SupplierI18n findByLangI18n(String lang);

}
