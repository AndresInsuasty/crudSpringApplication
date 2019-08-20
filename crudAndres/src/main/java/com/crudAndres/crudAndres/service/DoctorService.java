package com.crudAndres.crudAndres.service;

import java.util.Optional;

import com.crudAndres.crudAndres.entity.Doctor;

public interface DoctorService {

	public Iterable<Doctor> getAllDoctors();
	
	public Optional<Doctor> findById(Long id);
	
	public void save(Doctor doctor);
	
	public void deleteById(Long id);
	
	public void truncar();

}
