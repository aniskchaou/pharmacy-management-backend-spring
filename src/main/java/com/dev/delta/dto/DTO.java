package com.dev.delta.dto;

import com.dev.delta.entities.Buy;
import com.dev.delta.entities.Category;
import com.dev.delta.entities.Client;
import com.dev.delta.entities.Constructor;
import com.dev.delta.entities.ImageModel;
import com.dev.delta.entities.Medicament;
import com.dev.delta.entities.Service;
import com.dev.delta.entities.Supplier;
import com.dev.delta.entities.TypeMedicament;
import com.dev.delta.entitiesi18n.BuyI18n;
import com.dev.delta.entitiesi18n.CategoryI18n;
import com.dev.delta.entitiesi18n.ClientI18n;
import com.dev.delta.entitiesi18n.ConstructorI18n;
import com.dev.delta.entitiesi18n.MedicamentI18n;
import com.dev.delta.entitiesi18n.ServiceI18n;
import com.dev.delta.entitiesi18n.SupplierI18n;
import com.dev.delta.entitiesi18n.TypeMedicamentI18n;

public interface DTO {
	public Client  client=new Client();
	public Buy buy=new Buy();
	public Category category=new Category();
	public Constructor constructor=new Constructor();
	public Medicament medicament=new Medicament();
	public Service service=new Service();
	public Supplier supplier=new Supplier();
	public TypeMedicament typeMedicament=new TypeMedicament();
	
	
	public ClientI18n  clientI18n=new ClientI18n();
	public BuyI18n buyI18n=new BuyI18n();
	public CategoryI18n categoryI18n=new CategoryI18n();
	public ConstructorI18n constructorI18n=new ConstructorI18n();
	public MedicamentI18n medicamentI18n=new MedicamentI18n();
	public ServiceI18n serviceI18n=new ServiceI18n();
	public SupplierI18n supplierI18n=new SupplierI18n();
	public TypeMedicamentI18n typeMedicamentI18n=new TypeMedicamentI18n();
	
	ImageModel imageModel=new ImageModel();
	
	
	public void populate();
}
