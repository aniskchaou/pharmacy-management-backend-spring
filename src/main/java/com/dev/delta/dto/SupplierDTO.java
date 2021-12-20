package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.SupplierRepository;
import com.dev.delta.repositories.i18n.SupplierI18nRepositoryI18n;

@Service
public class SupplierDTO implements DTO {

	@Autowired
	SupplierRepository     supplierRepository   ;
	
	@Autowired
	SupplierI18nRepositoryI18n     supplierRepositoryI18n   ;
	
	@Override
	public void populate() {
		supplier.setAddress("fsdfs ");
		supplier.setDetails("sdfsd ");
		supplier.setMobile("sdfsdf ");
		supplier.setPrevious_balance("sdf ");
		supplier.setSupplier_name("KJBnkj ");
		supplierRepository.save(supplier);
		
		supplierI18n.setAddressI18n("Address");
		supplierI18n.setDetailsI18n("Details");
		supplierI18n.setMobileI18n("Mobile");
		supplierI18n.setPrevious_balanceI18n("Balance");
		supplierI18n.setSupplier_nameI18n("Name");
		supplierI18n.setLangI18n("EN");
		supplierI18n.setAddButtonI18n("Create");
		supplierI18n.setAddTitleI18n("Creat Supplier");
		supplierI18n.setAllTitleI18n("Suppliers");
		supplierI18n.setCloseButtonI18n("CLose");
		supplierI18n.setEditButtonI18n("Edit");
		supplierI18n.setEditTitleI18n("Edit Supplier");
		supplierI18n.setResetButtonI18n("Reset");
		supplierRepositoryI18n.save(supplierI18n);

	}

}
