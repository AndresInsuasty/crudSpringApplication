package com.crudAndres.crudAndres;

import static org.junit.Assert.*;
import java.util.Optional;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlConfig;
import org.springframework.test.context.jdbc.Sql.ExecutionPhase;
import org.springframework.test.context.jdbc.SqlConfig.TransactionMode;
import org.springframework.test.context.junit4.SpringRunner;

import com.crudAndres.crudAndres.entity.Doctor;
import com.crudAndres.crudAndres.service.DoctorServiceImpl;


@RunWith(SpringRunner.class)
@SpringBootTest
public class DoctorTest {


	@Autowired
	private DoctorServiceImpl service;

	private Doctor doctor;

	@Before
	public void init() {
		doctor = new Doctor();
		doctor.setId((long) 1);
		doctor.setCode("A1g5");
		doctor.setConsultingRoom("a203");
		doctor.setDomicile("1");
		doctor.setSpecialty("cirujano");
		doctor.setYears((long) 4);

	}
	
	@Test
	@Sql(scripts = "/saveTest.sql",config = @SqlConfig(transactionMode = TransactionMode.ISOLATED),executionPhase = ExecutionPhase.BEFORE_TEST_METHOD)
	@Sql(scripts = "/truncarTest.sql",config = @SqlConfig(transactionMode = TransactionMode.ISOLATED), executionPhase = ExecutionPhase.AFTER_TEST_METHOD)
	public void getAllDoctorTest() {
		Iterable<Doctor> doc = service.getAllDoctors();
		assertNotNull(doc);
	}
	

	@Test
	@Sql(scripts = "/saveTest.sql",config = @SqlConfig(transactionMode = TransactionMode.ISOLATED),executionPhase = ExecutionPhase.BEFORE_TEST_METHOD)
	@Sql(scripts = "/truncarTest.sql",config = @SqlConfig(transactionMode = TransactionMode.ISOLATED), executionPhase = ExecutionPhase.AFTER_TEST_METHOD)
	public void findByIdDoctorTest() {
		Optional<Doctor> doc = service.findById(doctor.getId());
		Doctor doctorResult = doc.get();
		Doctor doctorExpected = doctor;
		assertEquals(doctorExpected,doctorResult);
	}
	
	@Test
	@Sql(scripts = "/saveTest.sql",config = @SqlConfig(transactionMode = TransactionMode.ISOLATED),executionPhase = ExecutionPhase.BEFORE_TEST_METHOD)
	@Sql(scripts = "/truncarTest.sql",config = @SqlConfig(transactionMode = TransactionMode.ISOLATED), executionPhase = ExecutionPhase.AFTER_TEST_METHOD)
	public void deleteDoctorTest() {
		service.deleteById((long)1);
		assertEquals(Optional.empty(),service.findById((long)1));
	}
	
	
	@Test
	@Sql(scripts = "/truncarTest.sql",config = @SqlConfig(transactionMode = TransactionMode.ISOLATED), executionPhase = ExecutionPhase.AFTER_TEST_METHOD)
	@Sql(scripts = "/truncarTest.sql",config = @SqlConfig(transactionMode = TransactionMode.ISOLATED), executionPhase = ExecutionPhase.BEFORE_TEST_METHOD)
	public void saveDoctorTest() {
		service.save(doctor);
		Optional<Doctor> doc = service.findById((long)1);
		Doctor doctorResult = doc.get();
		assertEquals(doctor,doctorResult);
	}

}
