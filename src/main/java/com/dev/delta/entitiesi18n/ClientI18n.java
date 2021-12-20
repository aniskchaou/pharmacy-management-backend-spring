package com.dev.delta.entitiesi18n;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="clienti18n")
public class ClientI18n {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String   customer_nameI18n;
	String   emailI18n;
	String   mobileI18n;
	String   phoneI18n;
	String   cityI18n;
	String   zipI18n;
	String langI18n;
	String allTitleI18n;
	String editTitleI18n;
	String addTitleI18n;
	String addButtonI18n;
	String editButtonI18n;
	String resetButtonI18n;
	String closeButtonI18n;
	
	public ClientI18n() {
		// TODO Auto-generated constructor stub
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
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCustomer_nameI18n() {
		return customer_nameI18n;
	}
	public void setCustomer_nameI18n(String customer_nameI18n) {
		this.customer_nameI18n = customer_nameI18n;
	}
	public String getEmailI18n() {
		return emailI18n;
	}
	public void setEmailI18n(String emailI18n) {
		this.emailI18n = emailI18n;
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
	public String getCityI18n() {
		return cityI18n;
	}
	public void setCityI18n(String cityI18n) {
		this.cityI18n = cityI18n;
	}
	public String getZipI18n() {
		return zipI18n;
	}
	public void setZipI18n(String zipI18n) {
		this.zipI18n = zipI18n;
	}
	public String getLangI18n() {
		return langI18n;
	}
	public void setLangI18n(String langI18n) {
		this.langI18n = langI18n;
	}
	
	
	
}
