package com.crudAndres.crudAndres.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudAndres.crudAndres.entity.Doctor;
import com.crudAndres.crudAndres.repository.DoctorRepository;

@Service
public class DoctorServiceImpl implements DoctorService {

	@Autowired
	DoctorRepository repository;

	@Override
	public Iterable<Doctor> getAllDoctors() {
		// Service to obtain the list of doctors from repository
		return repository.findAll();
	}

	@Override
		// Service to save data in the database Http methods PUT and POST	
	public void save(Doctor doctor) {
		repository.save(doctor);
	}

	@Override
	public void deleteById(Long id) {
		// Service to delete data from database with an argument ID into URL
		repository.deleteById(id);

	}

	@Override
	public Optional<Doctor> findById(Long i) {
		// Find data by id
		return repository.findById(i);
	}

	@Override
	public void truncar() {
		// Function to delete 
		repository.deleteAll();
	}


}


