package com.dev.delta.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.repositories.BuyRepository;
import com.dev.delta.repositories.i18n.BuyRepositoryI18n;

@Service
public class BuyDTO implements DTO {

	@Autowired
	BuyRepository buyRepository;

	@Autowired
	BuyRepositoryI18n buyRepositoryI18n;

	@Override
	public void populate() {
		// TODO Auto-generated method stub
          buy.setBank_id("Bank of America");
          buy.setChalan_no(" ");
          buy.setManufacturer_id("Pharma Lab");
          buy.setPaytype("Credit Card");
          buy.setPurchase_date("12/11/2021");
          buy.setPurchase_details("N/A");
          buyRepository.save(buy);
          
          
          
          buyI18n.setBank_idI18n("Bank");
          buyI18n.setChalan_noI18n("");
          buyI18n.setManufacturer_idI18n("Constructor");
          buyI18n.setPaytypeI18n("Payment type");
          buyI18n.setPurchase_dateI18n("Purshase Date");
          buyI18n.setPurchase_detailsI18n("Purshase Details");
          buyI18n.setAddButtonI18n("Create");
          buyI18n.setAddTitleI18n("Add Purshates");
          buyI18n.setAllTitleI18n("Purshates");
          buyI18n.setCloseButtonI18n("Close");
          buyI18n.setEditButtonI18n("Edit");
          buyI18n.setEditTitleI18n("Edit Purshate");
          buyI18n.setResetButtonI18n("Reset");
          buyI18n.setLangI18n("EN");
          
          buyRepositoryI18n.save(buyI18n);
	}

}
