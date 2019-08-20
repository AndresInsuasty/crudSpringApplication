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

import com.crudAndres.crudAndres.entity.Doctor;
import com.crudAndres.crudAndres.repository.DoctorRepository;


@RunWith(SpringRunner.class)
@SpringBootTest
public class DoctorTest {

	@Autowired
	private DoctorRepository repository;

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
	@Sql(scripts = "/truncarTest.sql")
	@Sql(scripts = "/saveTest.sql")
	public void FindByIdDoctorRepositoryTest() {
		Optional<Doctor> doc = repository.findById(doctor.getId());
		Doctor doctorResult = doc.get();
		Doctor doctorExpected = doctor;
		assertEquals(doctorExpected.getId(), doctorResult.getId());
		assertEquals(doctorExpected.getCode(), doctorResult.getCode());
		assertEquals(doctorExpected.getConsultingRoom(), doctorResult.getConsultingRoom());
		assertEquals(doctorExpected.getDomicile(), doctorResult.getDomicile());
		assertEquals(doctorExpected.getSpecialty(), doctorResult.getSpecialty());
		assertEquals(doctorExpected.getYears(), doctorResult.getYears());
//		assertEquals(doctorExpected,doctorResult);

	}

	@After
	@Sql(scripts = "/truncarTest.sql")
	public void finish() {

	}

}
