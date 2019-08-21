package com.crudAndres.crudAndres.service;

import java.util.Optional;

import com.crudAndres.crudAndres.entity.Cita;

public interface CitasService {

	public Iterable<Cita> getAllCitas();
	
	public Optional<Cita> findById(Long id);

	public void save(Cita cita);

	public void deleteById(Long id);

}
