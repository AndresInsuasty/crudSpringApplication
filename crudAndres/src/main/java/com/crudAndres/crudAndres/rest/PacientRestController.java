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
import com.crudAndres.crudAndres.entity.PATIENTS;
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
	public List<PATIENTS> listar() {
		return (List<PATIENTS>) service.getAllPACIENTS();
	}

	@PostMapping
	public void insertar(@RequestBody PatientsModel patientsModel) {
		// mapping between entity and model
		PATIENTS patients= new PATIENTS();
		patients.setId(patientsModel.getId());
		patients.setName(patientsModel.getName());
		patients.setLastName(patientsModel.getLastName());
		patients.setBirthday(patientsModel.getBirthday());
		patients.setIdentification(patientsModel.getIdentification());
		patients.setTreatment(patientsModel.getTreatment());
		patients.setFee(patientsModel.getFee());
		service.save(patients);
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
