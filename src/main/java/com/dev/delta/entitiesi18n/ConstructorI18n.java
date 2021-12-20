package com.dev.delta.entitiesi18n;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "constructori18n")
public class ConstructorI18n {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String manufacturer_nameI18n;
	String mobileI18n;
	String phoneI18n;
	String faxI18n;
	String cityI18n;
	String stateI18n;
	String countryI18n;
	String emailI18n;
	String zipI18n;
	String previous_balanceI18n;
    String langI18n;
    String allTitleI18n;
	String editTitleI18n;
	String addTitleI18n;
	String addButtonI18n;
	String editButtonI18n;
	String resetButtonI18n;
	String closeButtonI18n;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getManufacturer_nameI18n() {
		return manufacturer_nameI18n;
	}
	public void setManufacturer_nameI18n(String manufacturer_nameI18n) {
		this.manufacturer_nameI18n = manufacturer_nameI18n;
	}
	public String getMobileI18n() {
		return mobileI18n;
	}
	public void setMobileI18n(String mobileI18n) {
		this.mobileI18n = mobileI18n;
	}
	public String getPhoneI18n() {
		return phoneI18n;
	}
	public void setPhoneI18n(String phoneI18n) {
		this.phoneI18n = phoneI18n;
	}
	public String getFaxI18n() {
		return faxI18n;
	}
	public void setFaxI18n(String faxI18n) {
		this.faxI18n = faxI18n;
	}
	public String getCityI18n() {
		return cityI18n;
	}
	public void setCityI18n(String cityI18n) {
		this.cityI18n = cityI18n;
	}
	public String getStateI18n() {
		return stateI18n;
	}
	public void setStateI18n(String stateI18n) {
		this.stateI18n = stateI18n;
	}
	public String getCountryI18n() {
		return countryI18n;
	}
	public void setCountryI18n(String countryI18n) {
		this.countryI18n = countryI18n;
	}
	public String getEmailI18n() {
		return emailI18n;
	}
	public void setEmailI18n(String emailI18n) {
		this.emailI18n = emailI18n;
	}
	public String getZipI18n() {
		return zipI18n;
	}
	public void setZipI18n(String zipI18n) {
		this.zipI18n = zipI18n;
	}
	public String getPrevious_balanceI18n() {
		return previous_balanceI18n;
	}
	public void setPrevious_balanceI18n(String previous_balanceI18n) {
		this.previous_balanceI18n = previous_balanceI18n;
	}
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
	
	
	
}
