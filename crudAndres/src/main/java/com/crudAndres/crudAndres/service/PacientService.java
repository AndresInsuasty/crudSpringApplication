package com.crudAndres.crudAndres.service;

import java.util.Optional;

import com.crudAndres.crudAndres.entity.Patient;

public interface PacientService {
	
	public Iterable<Patient> getAllPatients();
	
	public Optional<Patient> findById(Long id);
	
	public void save(Patient patient);
	
	public void deleteById(Long id);

}
