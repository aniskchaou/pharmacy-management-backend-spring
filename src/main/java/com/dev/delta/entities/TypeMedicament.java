package com.dev.delta.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="type")
public class TypeMedicament {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String  type_name;
	
	public TypeMedicament() {
		// TODO Auto-generated constructor stub
	}

	public TypeMedicament(String type_name) {
		super();
		this.type_name = type_name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType_name() {
		return type_name;
	}

	public void setType_name(String type_name) {
		this.type_name = type_name;
	}
	
	
}
