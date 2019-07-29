package com.crudAndres.crudAndres.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.crudAndres.crudAndres.entity.DOCTORS;
import com.crudAndres.crudAndres.repository.DoctorRepository;


@RestController
public class DoctorRestController {

	@Autowired
	private DoctorRepository repository;
	
	@GetMapping("/Doctores")
	@RequestMapping("/Doctores")
	public List<DOCTORS>listar(){
		return (List<DOCTORS>) repository.findAll();
		
	}
	
//	@PostMapping
//	public void insertar(RequestBody DOCTORS doc) {
//		DoctorRepository.save(doc);
//	}

	

	
}
