package com.crudAndres.crudAndres;

import static org.junit.Assert.*;

import java.util.Optional;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import com.crudAndres.crudAndres.entity.Patient;
import com.crudAndres.crudAndres.repository.PatientRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PatientTest {
	
	@Autowired
	private PatientRepository repository;
	
	private Patient patient;
	
	@Before
	public void init() {
		patient = new Patient();
		patient.setId((long)1);
		patient.setBirthday("10-10-1995");
		patient.setFee((long)1000);
		patient.setIdentification("a11515");
		patient.setLastName("Insuasty");
		patient.setName("Andres");
		patient.setTreatment((long) 1);
	}
	
	@Test
	@Sql(scripts = "/truncarTest.sql")
	@Sql(scripts = "/saveTest.sql")
	public void FindByIdPatientRepositoryTest() {
		
		Optional<Patient> pat = repository.findById((long)1); 
		Patient patientResult = pat.get();
		Patient patientExpected = patient;
		assertEquals(patientExpected,patientResult);
	}
	
	@After
	@Sql(scripts = "/truncarTest.sql")
	public void finish() {

	}
	

}
