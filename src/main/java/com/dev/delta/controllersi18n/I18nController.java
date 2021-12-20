package com.dev.delta.controllersi18n;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.delta.entities.Buy;
import com.dev.delta.entitiesi18n.BuyI18n;
import com.dev.delta.entitiesi18n.CategoryI18n;
import com.dev.delta.entitiesi18n.ClientI18n;
import com.dev.delta.entitiesi18n.ConstructorI18n;
import com.dev.delta.entitiesi18n.MedicamentI18n;
import com.dev.delta.entitiesi18n.ServiceI18n;
import com.dev.delta.entitiesi18n.SupplierI18n;
import com.dev.delta.entitiesi18n.TypeMedicamentI18n;
import com.dev.delta.repositories.BuyRepository;
import com.dev.delta.repositories.CategoryRepository;
import com.dev.delta.repositories.ClientRepository;
import com.dev.delta.repositories.ConstructorRepository;
import com.dev.delta.repositories.MedicamentRepository;
import com.dev.delta.repositories.ServiceRepository;
import com.dev.delta.repositories.SupplierRepository;
import com.dev.delta.repositories.TypeRepository;
import com.dev.delta.repositories.i18n.BuyRepositoryI18n;
import com.dev.delta.repositories.i18n.CategoryRepositoryI18n;
import com.dev.delta.repositories.i18n.Client18nRepositoryI18n;
import com.dev.delta.repositories.i18n.ConstructorRepositoryI18n;
import com.dev.delta.repositories.i18n.MedicamentRepositoryI18n;
import com.dev.delta.repositories.i18n.ServiceRepositoryI18n;
import com.dev.delta.repositories.i18n.SupplierI18nRepositoryI18n;
import com.dev.delta.repositories.i18n.TypeRepositoryI18n;

@RestController
@RequestMapping("i18n")
@CrossOrigin
public class I18nController {

	@Autowired
	BuyRepositoryI18n buyRepository;
	@Autowired
	CategoryRepositoryI18n categoryRepository;
	@Autowired
	Client18nRepositoryI18n clientRepository;
	@Autowired
	ConstructorRepositoryI18n constructorRepository;
	
	@Autowired
	MedicamentRepositoryI18n  medicamentRepository;
	
	@Autowired
	ServiceRepositoryI18n  serviceRepository;
	
	@Autowired
	SupplierI18nRepositoryI18n supplierRepository;
	
	@Autowired
	TypeRepositoryI18n typeRepository;
	
	
	
	@GetMapping("/category/{lang}")
	public ResponseEntity<CategoryI18n> getCategory(@PathVariable String lang) {
		CategoryI18n categoryI18n = categoryRepository.findByLangI18n(lang);
		return new ResponseEntity<CategoryI18n>(categoryI18n, HttpStatus.OK);
	}
	
	@GetMapping("/buy/{lang}")
	public ResponseEntity<BuyI18n> getBuy(@PathVariable String lang) {
		BuyI18n buyI18n = buyRepository.findByLangI18n(lang);
		return new ResponseEntity<BuyI18n>(buyI18n, HttpStatus.OK);
	}
	
	@GetMapping("/client/{lang}")
	public ResponseEntity<ClientI18n> getClient(@PathVariable String lang) {
		ClientI18n dashboardI18n = clientRepository.findByLangI18n(lang);
		return new ResponseEntity<ClientI18n>(dashboardI18n, HttpStatus.OK);
	}
	
	@GetMapping("/constructor/{lang}")
	public ResponseEntity<ConstructorI18n> getConstructor(@PathVariable String lang) {
		ConstructorI18n dashboardI18n = constructorRepository.findByLangI18n(lang);
		return new ResponseEntity<ConstructorI18n>(dashboardI18n, HttpStatus.OK);
	}
	
	@GetMapping("/medicament/{lang}")
	public ResponseEntity<MedicamentI18n> getMedicament(@PathVariable String lang) {
		MedicamentI18n medicamentI18n = medicamentRepository.findByLangI18n(lang);
		return new ResponseEntity<MedicamentI18n>(medicamentI18n, HttpStatus.OK);
	}
	
	@GetMapping("/service/{lang}")
	public ResponseEntity<ServiceI18n> getService(@PathVariable String lang) {
		ServiceI18n serviceI18n = serviceRepository.findByLangI18n(lang);
		return new ResponseEntity<ServiceI18n>(serviceI18n, HttpStatus.OK);
	}
	
	@GetMapping("/supplier/{lang}")
	public ResponseEntity<SupplierI18n> getSupplier(@PathVariable String lang) {
		SupplierI18n supplierI18n = supplierRepository.findByLangI18n(lang);
		return new ResponseEntity<SupplierI18n>(supplierI18n, HttpStatus.OK);
	}
	
	@GetMapping("/type/{lang}")
	public ResponseEntity<TypeMedicamentI18n> getType(@PathVariable String lang) {
		TypeMedicamentI18n typeI18n = typeRepository.findByLangI18n(lang);
		return new ResponseEntity<TypeMedicamentI18n>(typeI18n, HttpStatus.OK);
	}
    
	/*
	@GetMapping("/menu/{lang}")
	public ResponseEntity<MenuI18n> getMenu(@PathVariable String lang) {
		MenuI18n menuI18n = menuI18nRepository.findByLangI18n(lang);
		return new ResponseEntity<MenuI18n>(menuI18n, HttpStatus.OK);
	}
	*/
}
