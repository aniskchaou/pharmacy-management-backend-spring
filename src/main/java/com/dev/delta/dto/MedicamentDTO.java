package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.MedicamentRepository;
import com.dev.delta.repositories.i18n.MedicamentRepositoryI18n;

@Service
public class MedicamentDTO implements DTO {

	@Autowired
	MedicamentRepository   medicamentRepository;
	
	@Autowired
	MedicamentRepositoryI18n   medicamentRepositoryI18n;
	
	@Override
	public void populate() {
		medicament.setBox_size("qsd");
		medicament.setCategory_id("qsd");
		medicament.setDescription("q ");
		medicament.setGeneric_name("qsd");
		medicament.setManufacturer_id("qsd ");
		medicament.setManufacturer_price("qsd");
		medicament.setPrice("qsd ");
		medicament.setProduct_location("qsd ");
		medicament.setProduct_name("qsd ");
		medicament.setTax("qsd ");
		medicament.setType_name("qsd ");
		medicament.setUnit("g");
		medicamentRepository.save(medicament);
		
		medicamentI18n.setBox_sizeI18n("Box Size");
		medicamentI18n.setCategory_idI18n("Category");
		medicamentI18n.setDescriptionI18n("Description ");
		medicamentI18n.setGeneric_nameI18n("Generic Name");
		medicamentI18n.setManufacturer_idI18n("Constructor ");
		medicamentI18n.setManufacturer_priceI18n("Constructor Price");
		medicamentI18n.setPriceI18n("Price ");
		medicamentI18n.setProduct_locationI18n("Location ");
		medicamentI18n.setProduct_nameI18n("Name ");
		medicamentI18n.setTaxI18n("VAT ");
		medicamentI18n.setType_nameI18n("type Name ");
		medicamentI18n.setUnitI18n("Unit ");
		medicamentI18n.setAddButtonI18n("Create");
		medicamentI18n.setAddTitleI18n("Create Medicament");
		medicamentI18n.setAllTitleI18n("Medicaments");
		medicamentI18n.setCloseButtonI18n("Close");
		medicamentI18n.setEditButtonI18n("Edit");
		medicamentI18n.setEditTitleI18n("Edit Medicament");
		medicamentI18n.setResetButtonI18n("Reset");
		medicamentI18n.setLangI18n("EN");
		medicamentRepositoryI18n.save(medicamentI18n);

	}

}
