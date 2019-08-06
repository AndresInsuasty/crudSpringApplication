package com.crudAndres.crudAndres.service;

import com.crudAndres.crudAndres.entity.PACIENTS;

public interface PacientService {
	
	public Iterable<PACIENTS> getAllPACIENTS();
	
	public void save(PACIENTS pacients);
	
	public void deleteById(Long id);
	
	

}
