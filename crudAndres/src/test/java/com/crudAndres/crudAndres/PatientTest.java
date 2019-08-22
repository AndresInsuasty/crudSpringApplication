package com.crudAndres.crudAndres;

import static org.junit.Assert.*;

import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.Sql.ExecutionPhase;
import org.springframework.test.context.jdbc.SqlConfig;
import org.springframework.test.context.jdbc.SqlConfig.TransactionMode;
import org.springframework.test.context.junit4.SpringRunner;

import com.crudAndres.crudAndres.entity.Patient;
import com.crudAndres.crudAndres.service.PacientServiceImpl;


@RunWith(SpringRunner.class)
@SpringBootTest
public class PatientTest {
	
	@Autowired
	private PacientServiceImpl service;
	
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
	@Sql(scripts = "/saveTest.sql",config = @SqlConfig(transactionMode = TransactionMode.ISOLATED),executionPhase = ExecutionPhase.BEFORE_TEST_METHOD)
	@Sql(scripts = "/truncarTest.sql",config = @SqlConfig(transactionMode = TransactionMode.ISOLATED), executionPhase = ExecutionPhase.AFTER_TEST_METHOD)
	public void FindByIdPatientTest() {
		
		Optional<Patient> pat = service.findById((long)1); 
		Patient patientResult = pat.get();
		Patient patientExpected = patient;
		assertEquals(patientExpected,patientResult);
	}
	
	@Test
	@Sql(scripts = "/saveTest.sql",config = @SqlConfig(transactionMode = TransactionMode.ISOLATED),executionPhase = ExecutionPhase.BEFORE_TEST_METHOD)
	@Sql(scripts = "/truncarTest.sql",config = @SqlConfig(transactionMode = TransactionMode.ISOLATED), executionPhase = ExecutionPhase.AFTER_TEST_METHOD)
	public void deletePatientTest() {
		service.deleteById((long)1);
		assertEquals(Optional.empty(),service.findById((long)1));
	}
	
	

}
