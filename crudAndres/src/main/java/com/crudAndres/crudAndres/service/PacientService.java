package com.crudAndres.crudAndres.service;

import com.crudAndres.crudAndres.entity.Patient;

public interface PacientService {
	
	public Iterable<Patient> getAllPatients();
	
	public void save(Patient patient);
	
	public void deleteById(Long id);
	
	

}
