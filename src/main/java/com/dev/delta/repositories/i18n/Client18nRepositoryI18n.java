package com.dev.delta.repositories.i18n;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.dev.delta.entities.Client;
import com.dev.delta.entitiesi18n.ClientI18n;
@RepositoryRestResource
public interface Client18nRepositoryI18n extends JpaRepository<ClientI18n, Long>  {

	ClientI18n findByLangI18n(String lang);

}
