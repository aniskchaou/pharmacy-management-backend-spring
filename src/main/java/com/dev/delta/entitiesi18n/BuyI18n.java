package com.dev.delta.entitiesi18n;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="buyi18n")
public class BuyI18n {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String  manufacturer_idI18n;
	String  purchase_dateI18n;
	String  chalan_noI18n;
	String  purchase_detailsI18n;
	String  paytypeI18n;
	String  bank_idI18n;
	String langI18n;
	String allTitleI18n;
	String editTitleI18n;
	String addTitleI18n;
	String addButtonI18n;
	String editButtonI18n;
	String resetButtonI18n;
	String closeButtonI18n;
	
	
	
	public String getLangI18n() {
		return langI18n;
	}
	public void setLangI18n(String langI18n) {
		this.langI18n = langI18n;
	}
	public String getAllTitleI18n() {
		return allTitleI18n;
	}
	public void setAllTitleI18n(String allTitleI18n) {
		this.allTitleI18n = allTitleI18n;
	}
	public String getEditTitleI18n() {
		return editTitleI18n;
	}
	public void setEditTitleI18n(String editTitleI18n) {
		this.editTitleI18n = editTitleI18n;
	}
	public String getAddTitleI18n() {
		return addTitleI18n;
	}
	public void setAddTitleI18n(String addTitleI18n) {
		this.addTitleI18n = addTitleI18n;
	}
	public String getAddButtonI18n() {
		return addButtonI18n;
	}
	public void setAddButtonI18n(String addButtonI18n) {
		this.addButtonI18n = addButtonI18n;
	}
	public String getEditButtonI18n() {
		return editButtonI18n;
	}
	public void setEditButtonI18n(String editButtonI18n) {
		this.editButtonI18n = editButtonI18n;
	}
	public String getResetButtonI18n() {
		return resetButtonI18n;
	}
	public void setResetButtonI18n(String resetButtonI18n) {
		this.resetButtonI18n = resetButtonI18n;
	}
	public String getCloseButtonI18n() {
		return closeButtonI18n;
	}
	public void setCloseButtonI18n(String closeButtonI18n) {
		this.closeButtonI18n = closeButtonI18n;
	}
	public BuyI18n() {
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getManufacturer_idI18n() {
		return manufacturer_idI18n;
	}

	public void setManufacturer_idI18n(String manufacturer_idI18n) {
		this.manufacturer_idI18n = manufacturer_idI18n;
	}

	public String getPurchase_dateI18n() {
		return purchase_dateI18n;
	}

	public void setPurchase_dateI18n(String purchase_dateI18n) {
		this.purchase_dateI18n = purchase_dateI18n;
	}

	public String getChalan_noI18n() {
		return chalan_noI18n;
	}

	public void setChalan_noI18n(String chalan_noI18n) {
		this.chalan_noI18n = chalan_noI18n;
	}

	public String getPurchase_detailsI18n() {
		return purchase_detailsI18n;
	}

	public void setPurchase_detailsI18n(String purchase_detailsI18n) {
		this.purchase_detailsI18n = purchase_detailsI18n;
	}

	public String getPaytypeI18n() {
		return paytypeI18n;
	}

	public void setPaytypeI18n(String paytypeI18n) {
		this.paytypeI18n = paytypeI18n;
	}

	public String getBank_idI18n() {
		return bank_idI18n;
	}

	public void setBank_idI18n(String bank_idI18n) {
		this.bank_idI18n = bank_idI18n;
	}

	
}
