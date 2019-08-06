package com.crudAndres.crudAndres.service;

import com.crudAndres.crudAndres.entity.CITAS;

public interface CitasService {

	public Iterable<CITAS> getAllCITAS();

	public void save(CITAS citas);

	public void deleteById(Long id);

}
