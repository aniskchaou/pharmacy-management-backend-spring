package com.dev.delta.repositories.i18n;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.dev.delta.entities.Medicament;
import com.dev.delta.entitiesi18n.MedicamentI18n;
@RepositoryRestResource
public interface MedicamentRepositoryI18n extends JpaRepository<MedicamentI18n, Long>  {

	MedicamentI18n findByLangI18n(String lang);

}
