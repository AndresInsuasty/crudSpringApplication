package com.crudAndres.crudAndres.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudAndres.crudAndres.entity.PATIENTS;
import com.crudAndres.crudAndres.repository.PacientRepository;
@Service
public class PacientServiceImpl implements PacientService {

	@Autowired
	PacientRepository repository;

	@Override
	public Iterable<PATIENTS> getAllPACIENTS() {
		// Function to obtain patients from database
		return repository.findAll();
	}

	@Override
	public void save(PATIENTS patients) {
		// Function to save Patients Http Methods like PUT and POST
		repository.save(patients);
	}

	@Override
	public void deleteById(Long id) {
		// Function to delete data from database
		repository.deleteById(id);
	}

}
