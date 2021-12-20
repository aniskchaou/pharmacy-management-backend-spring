package com.dev.delta.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.TypeMedicament;
import com.dev.delta.repositories.TypeRepository;

@Service
public class TypeService {
	@Autowired
	TypeRepository  typeRepository;
	
	public TypeMedicament saveOrUpdate(TypeMedicament type)
	{
		
		return typeRepository.save(type);
	}
	
	public Iterable<TypeMedicament> findAll()
	{
		return typeRepository.findAll();
	}
	
	public TypeMedicament findById(Long id)
	{
		return typeRepository.findById(id).orElseThrow();
	}
	
	public void delete(Long id)
	{
		TypeMedicament type=findById(id);
		typeRepository.delete(type);
	}
}
