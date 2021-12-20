package com.dev.delta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.dev.delta.dto.BuyDTO;
import com.dev.delta.dto.CategoryDTO;
import com.dev.delta.dto.ClientDTO;
import com.dev.delta.dto.ConstructorDTO;
import com.dev.delta.dto.MedicamentDTO;
import com.dev.delta.dto.ServiceDTO;
import com.dev.delta.dto.SupplierDTO;
import com.dev.delta.dto.TypeDTO;

@ComponentScan({ "com.dev.delta.controllersi18n","com.dev.delta.security","com.dev.delta.controllers","com.dev.delta.services", "com.dev.delta.dto" }) // to scan repository files
@EntityScan({"com.dev.delta.entities","com.dev.delta.entitiesi18n"})
@EnableJpaRepositories({"com.dev.delta.repositories","com.dev.delta.repositoriesi18n"})
@SpringBootApplication
public class SpringbootPharmalifeCodecanyon1Application implements CommandLineRunner{

	@Autowired
	ClientDTO  clientDTO;
	
	@Autowired
	BuyDTO buyDTO;
	
	@Autowired
	CategoryDTO   categoryDTO;
	
	@Autowired
	ConstructorDTO constructorDTO;
	
	@Autowired
	MedicamentDTO  medicamentDTO;
	
	@Autowired
	ServiceDTO  serviceDTO;
	
	@Autowired
	SupplierDTO supplierDTO;
	
	@Autowired
	TypeDTO typeDTO;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootPharmalifeCodecanyon1Application.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		clientDTO.populate();
		buyDTO.populate();
		categoryDTO.populate();
		constructorDTO.populate();
		medicamentDTO.populate();
		serviceDTO.populate();
		supplierDTO.populate();
		typeDTO.populate();
		
	}

}
