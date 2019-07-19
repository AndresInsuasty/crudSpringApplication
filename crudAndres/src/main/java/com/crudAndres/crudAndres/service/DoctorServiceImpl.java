package com.crudAndres.crudAndres.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudAndres.crudAndres.entity.DOCTORS;
import com.crudAndres.crudAndres.repository.DoctorRepository;

@Service
public class DoctorServiceImpl implements DoctorService{

	@Autowired
	DoctorRepository repository;
	
	@Override
	public Iterable<DOCTORS> getAllDOCTORS() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}
	
	

}
