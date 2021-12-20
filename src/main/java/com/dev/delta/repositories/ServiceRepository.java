package com.dev.delta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.dev.delta.entities.Service;
import com.dev.delta.entitiesi18n.ServiceI18n;
@RepositoryRestResource
public interface ServiceRepository  extends JpaRepository<Service, Long> {


}
