package com.dev.delta.repositories.i18n;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.dev.delta.entities.Service;
import com.dev.delta.entitiesi18n.ServiceI18n;
@RepositoryRestResource
public interface ServiceRepositoryI18n  extends JpaRepository<ServiceI18n, Long> {

	ServiceI18n findByLangI18n(String lang);

}
