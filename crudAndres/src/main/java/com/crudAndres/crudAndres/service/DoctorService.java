package com.crudAndres.crudAndres.service;

import com.crudAndres.crudAndres.entity.DOCTORS;

public interface DoctorService {

	public Iterable<DOCTORS> getAllDOCTORS();
	
	public void save(DOCTORS doctors);
	
	public void deleteById(Long id);

}
