package com.dev.delta.entitiesi18n;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="medicamenti18n")
public class MedicamentI18n {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String   product_nameI18n;
	String   generic_nameI18n;
      String    box_sizeI18n;
      String    unitI18n;
      String   product_locationI18n;
      String    descriptionI18n;
      String    type_nameI18n;
      String   category_idI18n;
      String   priceI18n;
      String  taxI18n;
      String   manufacturer_idI18n;
      String   manufacturer_priceI18n;
      String langI18n;
      String allTitleI18n;
  	String editTitleI18n;
  	String addTitleI18n;
  	String addButtonI18n;
  	String editButtonI18n;
  	String resetButtonI18n;
  	String closeButtonI18n;
  	
  	
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
	public String getProduct_nameI18n() {
		return product_nameI18n;
	}
	public void setProduct_nameI18n(String product_nameI18n) {
		this.product_nameI18n = product_nameI18n;
	}
	public String getGeneric_nameI18n() {
		return generic_nameI18n;
	}
	public void setGeneric_nameI18n(String generic_nameI18n) {
		this.generic_nameI18n = generic_nameI18n;
	}
	public String getBox_sizeI18n() {
		return box_sizeI18n;
	}
	public void setBox_sizeI18n(String box_sizeI18n) {
		this.box_sizeI18n = box_sizeI18n;
	}
	public String getUnitI18n() {
		return unitI18n;
	}
	public void setUnitI18n(String unitI18n) {
		this.unitI18n = unitI18n;
	}
	public String getProduct_locationI18n() {
		return product_locationI18n;
	}
	public void setProduct_locationI18n(String product_locationI18n) {
		this.product_locationI18n = product_locationI18n;
	}
	public String getDescriptionI18n() {
		return descriptionI18n;
	}
	public void setDescriptionI18n(String descriptionI18n) {
		this.descriptionI18n = descriptionI18n;
	}
	public String getType_nameI18n() {
		return type_nameI18n;
	}
	public void setType_nameI18n(String type_nameI18n) {
		this.type_nameI18n = type_nameI18n;
	}
	public String getCategory_idI18n() {
		return category_idI18n;
	}
	public void setCategory_idI18n(String category_idI18n) {
		this.category_idI18n = category_idI18n;
	}
	public String getPriceI18n() {
		return priceI18n;
	}
	public void setPriceI18n(String priceI18n) {
		this.priceI18n = priceI18n;
	}
	public String getTaxI18n() {
		return taxI18n;
	}
	public void setTaxI18n(String taxI18n) {
		this.taxI18n = taxI18n;
	}
	public String getManufacturer_idI18n() {
		return manufacturer_idI18n;
	}
	public void setManufacturer_idI18n(String manufacturer_idI18n) {
		this.manufacturer_idI18n = manufacturer_idI18n;
	}
	public String getManufacturer_priceI18n() {
		return manufacturer_priceI18n;
	}
	public void setManufacturer_priceI18n(String manufacturer_priceI18n) {
		this.manufacturer_priceI18n = manufacturer_priceI18n;
	}
	public String getLangI18n() {
		return langI18n;
	}
	public void setLangI18n(String langI18n) {
		this.langI18n = langI18n;
	}
      
     
}
