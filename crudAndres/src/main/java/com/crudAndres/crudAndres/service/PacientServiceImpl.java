package com.crudAndres.crudAndres.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudAndres.crudAndres.entity.Patient;
import com.crudAndres.crudAndres.repository.PatientRepository;
@Service
public class PacientServiceImpl implements PacientService {

	@Autowired
	PatientRepository repository;

	@Override
	public Iterable<Patient> getAllPatients() {
		// Function to obtain patients from database
		return repository.findAll();
	}

	@Override
	public void save(Patient patient) {
		// Function to save Patients Http Methods like PUT and POST
		repository.save(patient);
	}

	@Override
	public void deleteById(Long id) {
		// Function to delete data from database
		repository.deleteById(id);
	}

	@Override
	public Optional<Patient> findById(Long id) {
		// Function to find data by id
		return repository.findById(id);
	}

}
