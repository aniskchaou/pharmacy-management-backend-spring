package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.ServiceRepository;
import com.dev.delta.repositories.i18n.ServiceRepositoryI18n;

@Service
public class ServiceDTO implements DTO {

	@Autowired
	ServiceRepository   serviceRepository;
	
	@Autowired
	ServiceRepositoryI18n   serviceRepositoryI18n;
	
	@Override
	public void populate() {
		service.setCharge("122");
		service.setDescription("N/A");
		service.setService_name("Examination");
		service.setTax("20%");
		serviceRepository.save(service);
		
		serviceI18n.setChargeI18n("Charge");
		serviceI18n.setDescriptionI18n("Description");
		serviceI18n.setService_nameI18n("Name");
		serviceI18n.setTaxI18n("VAT");
		serviceI18n.setAddButtonI18n("Create");
		serviceI18n.setAddTitleI18n("Create Service");
		serviceI18n.setAllTitleI18n("Services");
		serviceI18n.setCloseButtonI18n("Close");
		serviceI18n.setEditButtonI18n("Edit");
		serviceI18n.setEditTitleI18n("Edit Service");
		serviceI18n.setResetButtonI18n("Reset");
		serviceI18n.setLangI18n("EN");
		serviceRepositoryI18n.save(serviceI18n);
	}

}
