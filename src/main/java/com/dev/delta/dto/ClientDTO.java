package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.ClientRepository;
import com.dev.delta.repositories.i18n.Client18nRepositoryI18n;

@Service
public class ClientDTO implements DTO{

	@Autowired
	ClientRepository   clientRepository;
	
	@Autowired
	Client18nRepositoryI18n   clientRepositoryI18n;
	
	@Override
	public void populate() {
		// TODO Auto-generated method stub
		client.setCity("Paris");
		client.setCustomer_name("John Doe");
		client.setEmail("johndoe@gmail.com");
		client.setMobile("976087698");
		client.setPhone("980987");
		client.setZip("9809798");
		clientRepository.save(client);
		
		
		clientI18n.setCityI18n("City");
		clientI18n.setCustomer_nameI18n("Name");
		clientI18n.setEmailI18n("Email");
		clientI18n.setMobileI18n("Mobile");
		clientI18n.setPhoneI18n("Phone");
		clientI18n.setZipI18n("Zip");
		clientI18n.setAddButtonI18n("Create");
		clientI18n.setAddTitleI18n("Add");
		clientI18n.setAllTitleI18n("Clients");
		clientI18n.setCloseButtonI18n("Close");
		clientI18n.setEditButtonI18n("Edit");
		clientI18n.setEditTitleI18n("Edit Category");
		clientI18n.setResetButtonI18n("Reset");
		clientI18n.setLangI18n("EN");
		clientRepositoryI18n.save(clientI18n);
	}

}
