package com.crudAndres.crudAndres.rest;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.crudAndres.crudAndres.entity.DOCTORS;
import com.crudAndres.crudAndres.repository.DoctorRepository;


@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
@RequestMapping("/Doctores")
public class DoctorRestController {

	@Autowired
	private DoctorRepository repository;
	
	@GetMapping
	public List<DOCTORS>listar(){
		return (List<DOCTORS>) repository.findAll();
		
	}
	
	@PostMapping
	public void insertar(@RequestBody DOCTORS doctors) {
		repository.save(doctors);
	}
	
	@PutMapping
	public void modificar(@RequestBody DOCTORS doctors) {
		repository.save(doctors);
	}
	
	@DeleteMapping
	public void eliminar(Long id) {
		repository.deleteById(id);
	}
	
}
