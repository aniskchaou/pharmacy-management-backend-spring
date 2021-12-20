package com.dev.delta.repositories.i18n;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.dev.delta.entities.Constructor;
import com.dev.delta.entitiesi18n.ConstructorI18n;


@RepositoryRestResource
public interface ConstructorRepositoryI18n  extends JpaRepository<ConstructorI18n, Long> {

	ConstructorI18n findByLangI18n(String lang);

}
