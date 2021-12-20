package com.dev.delta.repositories.i18n;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.dev.delta.entities.Category;
import com.dev.delta.entitiesi18n.CategoryI18n;
@RepositoryRestResource
public interface CategoryRepositoryI18n  extends JpaRepository<CategoryI18n, Long> {

	CategoryI18n findByLangI18n(String lang);

}
