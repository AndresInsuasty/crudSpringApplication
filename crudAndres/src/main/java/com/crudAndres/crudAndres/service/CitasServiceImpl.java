package com.crudAndres.crudAndres.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudAndres.crudAndres.entity.CITAS;
import com.crudAndres.crudAndres.repository.CitasRepository;
@Service
public class CitasServiceImpl implements CitasService{
	
	@Autowired
	CitasRepository repository;

	@Override
	public Iterable<CITAS> getAllCITAS() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public void save(CITAS citas) {
		// TODO Auto-generated method stub
		repository.save(citas);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

}
