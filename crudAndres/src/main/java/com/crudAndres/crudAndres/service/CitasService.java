package com.crudAndres.crudAndres.service;

import com.crudAndres.crudAndres.entity.Cita;

public interface CitasService {

	public Iterable<Cita> getAllCitas();

	public void save(Cita cita);

	public void deleteById(Long id);

}
