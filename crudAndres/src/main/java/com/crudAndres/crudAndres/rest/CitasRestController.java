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

import com.crudAndres.crudAndres.entity.Cita;
import com.crudAndres.crudAndres.model.CitasModel;
import com.crudAndres.crudAndres.service.CitasServiceImpl;


@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT,
		RequestMethod.DELETE })
@RequestMapping("/Citas")
public class CitasRestController {
	
	@Autowired
	private CitasServiceImpl service;
	
	@GetMapping
	public List<Cita> listar(){
		
	return (List<Cita>)service.getAllCitas();
	}
	
	@PostMapping
	public void insertar(@RequestBody CitasModel citasModel) {
		// Mapping between model and entity
		Cita cita = new Cita();
		cita.setId(citasModel.getId());
		cita.setdoctorId(citasModel.getDoctorId());
		cita.setpacientId(citasModel.getPacientId());
		cita.setnewDate(citasModel.getNewDate());
		cita.settime(citasModel.getTime());
		service.save(cita);
	}
	
	@PutMapping
	public void modificar(@RequestBody CitasModel citasModel) {
		insertar(citasModel);
	}
	  
	@DeleteMapping("/{id}")
	public @ResponseBody void eliminar(@PathVariable Long id) {
		service.deleteById(id);
	}
	

}
