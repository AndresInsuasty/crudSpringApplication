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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.crudAndres.crudAndres.entity.CITAS;
import com.crudAndres.crudAndres.service.CitasServiceImpl;


@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT,
		RequestMethod.DELETE })
@RequestMapping("/Citas")
public class CitasRestController {
	
	@Autowired
	private CitasServiceImpl service;
	
	@GetMapping
	public List<CITAS> listar(){
		
	return (List<CITAS>)service.getAllCITAS();
	}
	
	@PostMapping
	public void insertar(@RequestBody CITAS citas) {
		service.save(citas);
	}
	
	@PutMapping
	public void modificar(@RequestBody CITAS citas) {
		service.save(citas);
	}
	  
	@DeleteMapping("/{id}")
	public @ResponseBody void eliminar(@PathVariable Long id) {
		service.deleteById(id);
	}
	

}
