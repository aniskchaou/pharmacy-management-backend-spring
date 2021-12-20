package com.dev.delta.repositories.i18n;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.dev.delta.entitiesi18n.TypeMedicamentI18n;
@RepositoryRestResource
public interface TypeRepositoryI18n extends JpaRepository<TypeMedicamentI18n, Long>  {

	TypeMedicamentI18n findByLangI18n(String lang);

}
