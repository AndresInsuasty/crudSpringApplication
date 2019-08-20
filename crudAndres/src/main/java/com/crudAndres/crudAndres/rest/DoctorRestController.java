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
import com.crudAndres.crudAndres.entity.Doctor;
import com.crudAndres.crudAndres.model.DoctorModel;
import com.crudAndres.crudAndres.service.DoctorServiceImpl;


@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
@RequestMapping("/Doctores")
public class DoctorRestController {

	@Autowired
	private DoctorServiceImpl service;
		
	@GetMapping
	public List<Doctor>listar(){
		return (List<Doctor>) service.getAllDoctors();
		
	}
	
	@PostMapping
	public void insertar(@RequestBody DoctorModel doctorModel) {
		Doctor doctor = new Doctor();
		// Mapping between model and entity
		doctor.setId(doctorModel.getId());
		doctor.setCode(doctorModel.getCode());
		doctor.setSpecialty(doctorModel.getSpecialty());
		doctor.setYears(doctorModel.getYears());
		doctor.setConsultingRoom(doctorModel.getConsultingRoom());
		doctor.setDomicile(doctorModel.getDomicile());
		
		service.save(doctor);
	}
	
	@PutMapping
	public void modificar(@RequestBody DoctorModel doctorModel) {
		insertar(doctorModel);
	}
	
	@DeleteMapping("/{id}")
	public @ResponseBody void eliminar(@PathVariable Long id) {
		service.deleteById(id);
	}
	
	
}
