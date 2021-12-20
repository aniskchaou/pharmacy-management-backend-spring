package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.TypeRepository;
import com.dev.delta.repositories.i18n.TypeRepositoryI18n;

@Service
public class TypeDTO implements DTO {

	@Autowired
	TypeRepository   typeRepository;
	
	@Autowired
	TypeRepositoryI18n   typeRepositoryI18n;
	
	@Override
	public void populate() {
		typeMedicament.setType_name("sdqsd");
		typeRepository.save(typeMedicament);
		
		typeMedicamentI18n.setType_nameI18n("Type Name");
		typeMedicamentI18n.setLangI18n("EN");
		typeMedicamentI18n.setAddButtonI18n("Create");
		typeMedicamentI18n.setAddTitleI18n("Add Type");
		typeMedicamentI18n.setAllTitleI18n("Types");
		typeMedicamentI18n.setCloseButtonI18n("CLose");
		typeMedicamentI18n.setEditButtonI18n("Edit");
		typeMedicamentI18n.setEditTitleI18n("Edit Type");
		typeMedicamentI18n.setResetButtonI18n("Reset");
		typeRepositoryI18n.save(typeMedicamentI18n);

	}

}
