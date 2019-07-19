package com.crudAndres.crudAndres.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.crudAndres.crudAndres.entity.DOCTORS;
import com.crudAndres.crudAndres.repository.DoctorRepository;

@RestController
public class restDemoController {

	@Autowired
	private DoctorRepository repository;
	
	@GetMapping
	public List<DOCTORS> listar(){
		return (List<DOCTORS>) repository.findAll();
	}
}
