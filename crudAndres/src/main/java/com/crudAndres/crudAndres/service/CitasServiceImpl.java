package com.crudAndres.crudAndres.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudAndres.crudAndres.entity.CITAS;
import com.crudAndres.crudAndres.repository.CitasRepository;
@Service
public class CitasServiceImpl implements CitasService{
	
	@Autowired
	CitasRepository repository;

	@Override
	public Iterable<CITAS> getAllCITAS() {
		// Function to obtain dates from repository
		return repository.findAll();
	}

	@Override
	public void save(CITAS citas) {
		// Function to save dates, Http methods like PUT and POST
		repository.save(citas);
	}

	@Override
	public void deleteById(Long id) {
		// Function to delete some data in database
		repository.deleteById(id);
	}

}
