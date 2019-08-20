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
import com.crudAndres.crudAndres.entity.Patient;
import com.crudAndres.crudAndres.model.PatientsModel;
import com.crudAndres.crudAndres.service.PacientServiceImpl;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT,
		RequestMethod.DELETE })
@RequestMapping("/Pacientes")
public class PacientRestController {

	@Autowired
	private PacientServiceImpl service;
	

	@GetMapping
	public List<Patient> listar() {
		return (List<Patient>) service.getAllPatients();
	}

	@PostMapping
	public void insertar(@RequestBody PatientsModel patientsModel) {
		// mapping between entity and model
		Patient patient= new Patient();
		patient.setId(patientsModel.getId());
		patient.setName(patientsModel.getName());
		patient.setLastName(patientsModel.getLastName());
		patient.setBirthday(patientsModel.getBirthday());
		patient.setIdentification(patientsModel.getIdentification());
		patient.setTreatment(patientsModel.getTreatment());
		patient.setFee(patientsModel.getFee());
		service.save(patient);
	}

	@PutMapping
	public void modificar(@RequestBody PatientsModel patientsModel) {
		insertar(patientsModel);
	}
	
	@DeleteMapping("/{id}")
	public @ResponseBody void eliminar(@PathVariable Long id) {
		service.deleteById(id);
	}

}
