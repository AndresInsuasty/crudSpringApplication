package com.crudAndres.crudAndres.rest;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.crudAndres.crudAndres.entity.PACIENTS;
import com.crudAndres.crudAndres.repository.PacientRepository;

@RestController
public class PacientRestController {

	@Autowired
	private PacientRepository repository;
	
	@GetMapping
	@RequestMapping("/Pacientes")
	public List<PACIENTS> listar(){
		return (List<PACIENTS>) repository.findAll();
	}
}
