package com.crudAndres.crudAndres.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.crudAndres.crudAndres.entity.PACIENTS;
import com.crudAndres.crudAndres.repository.PacientRepository;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT,
		RequestMethod.DELETE })
@RequestMapping("/Pacientes")
public class PacientRestController {

	@Autowired
	private PacientRepository repository;

	@GetMapping
	public List<PACIENTS> listar() {
		return (List<PACIENTS>) repository.findAll();
	}

	@PostMapping
	public void insertar(@RequestBody PACIENTS pacients) {
		repository.save(pacients);
	}

	@PutMapping
	public void modificar(@RequestBody PACIENTS pacients) {
		repository.save(pacients);
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable("id") Long id) {
		repository.deleteById(id);
	}

}
