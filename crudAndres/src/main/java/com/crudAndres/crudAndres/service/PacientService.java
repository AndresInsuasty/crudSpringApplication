package com.crudAndres.crudAndres.service;

import com.crudAndres.crudAndres.entity.PATIENTS;

public interface PacientService {
	
	public Iterable<PATIENTS> getAllPACIENTS();
	
	public void save(PATIENTS patients);
	
	public void deleteById(Long id);
	
	

}
