package com.crudAndres.crudAndres.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudAndres.crudAndres.entity.DOCTORS;
import com.crudAndres.crudAndres.repository.DoctorRepository;

@Service
public class DoctorServiceImpl implements DoctorService {

	@Autowired
	DoctorRepository repository;

	@Override
	public Iterable<DOCTORS> getAllDOCTORS() {
		// Service to obtain the list of doctors from repository
		return repository.findAll();
	}

	@Override
		// Service to save data in the database Http methods PUT and POST	
	public void save(DOCTORS doctors) {
		repository.save(doctors);
	}

	@Override
	public void deleteById(Long id) {
		// Service to delete data from database with an argument ID into URL
		repository.deleteById(id);

	}

}
