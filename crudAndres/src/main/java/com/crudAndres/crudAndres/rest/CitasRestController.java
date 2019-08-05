//package com.crudAndres.crudAndres.rest;
//
//import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.crudAndres.crudAndres.entity.CITAS;
//import com.crudAndres.crudAndres.repository.CitasRepository;
//
//
//
//@RestController
//@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT,
//		RequestMethod.DELETE })
//@RequestMapping("/Citas")
//public class CitasRestController {
//	
//	@Autowired
//	private CitasRepository repository;
//	
//	@GetMapping
//	public List<CITAS> listar(){
//	return (List<CITAS>)repository.findAll();
//	}
//
//}
