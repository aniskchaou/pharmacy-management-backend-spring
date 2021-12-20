package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.ConstructorRepository;
import com.dev.delta.repositories.i18n.ConstructorRepositoryI18n;

@Service
public class ConstructorDTO implements DTO {

	@Autowired
	ConstructorRepository  constructorRepository;
	
	@Autowired
	ConstructorRepositoryI18n  constructorRepositoryI18n;
	
	@Override
	public void populate() {
		constructor.setCity(" ");
		constructor.setCountry(" ");
		constructor.setEmail(" ");
		constructor.setFax(" ");
		constructor.setManufacturer_name(" ");
		constructor.setMobile(" ");
		constructor.setPhone(" ");
		constructor.setPrevious_balance(" ");
		constructor.setState(" ");
		constructor.setZip(" ");
		constructorRepository.save(constructor);
		
		constructorI18n.setCityI18n("City");
		constructorI18n.setCountryI18n("Country ");
		constructorI18n.setEmailI18n("Email");
		constructorI18n.setFaxI18n("Fax");
		constructorI18n.setManufacturer_nameI18n("Constructor");
		constructorI18n.setMobileI18n("Mobile");
		constructorI18n.setPhoneI18n("Phone");
		constructorI18n.setPrevious_balanceI18n(" ");
		constructorI18n.setStateI18n("State");
		constructorI18n.setZipI18n("ZIP");
		constructorI18n.setAddButtonI18n("Create");
		constructorI18n.setAddTitleI18n("Create Constructor");
		constructorI18n.setAllTitleI18n("Constructors");
		constructorI18n.setCloseButtonI18n("Close");
		constructorI18n.setEditButtonI18n("Edit");
		constructorI18n.setEditTitleI18n("Edit Constructor");
		constructorI18n.setResetButtonI18n("Reset");
		constructorI18n.setLangI18n("EN");
		constructorRepositoryI18n.save(constructorI18n);

	}

}
