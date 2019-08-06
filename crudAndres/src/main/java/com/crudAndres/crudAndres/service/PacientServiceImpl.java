package com.crudAndres.crudAndres.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudAndres.crudAndres.entity.PACIENTS;
import com.crudAndres.crudAndres.repository.PacientRepository;
@Service
public class PacientServiceImpl implements PacientService {

	@Autowired
	PacientRepository repository;

	@Override
	public Iterable<PACIENTS> getAllPACIENTS() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public void save(PACIENTS pacients) {
		// TODO Auto-generated method stub
		repository.save(pacients);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

}
