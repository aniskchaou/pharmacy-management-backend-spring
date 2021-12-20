package com.dev.delta.repositories.i18n;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.dev.delta.entities.Buy;
import com.dev.delta.entitiesi18n.BuyI18n;
@RepositoryRestResource
public interface BuyRepositoryI18n extends JpaRepository<BuyI18n, Long>  {

	BuyI18n findByLangI18n(String lang);

}
