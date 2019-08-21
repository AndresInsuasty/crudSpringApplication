package com.crudAndres.crudAndres.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudAndres.crudAndres.entity.Cita;
import com.crudAndres.crudAndres.repository.CitasRepository;
@Service
public class CitasServiceImpl implements CitasService{
	
	@Autowired
	CitasRepository repository;

	@Override
	public Iterable<Cita> getAllCitas() {
		// Function to obtain dates from repository
		return repository.findAll();
	}

	@Override
	public void save(Cita cita) {
		// Function to save dates, Http methods like PUT and POST
		repository.save(cita);
	}

	@Override
	public void deleteById(Long id) {
		// Function to delete some data in database
		repository.deleteById(id);
	}

	@Override
	public Optional<Cita> findById(Long id) {

		return repository.findById(id);
	}

}
