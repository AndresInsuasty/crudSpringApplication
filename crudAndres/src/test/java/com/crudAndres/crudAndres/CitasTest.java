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

import com.crudAndres.crudAndres.entity.Cita;
import com.crudAndres.crudAndres.repository.CitasRepository;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CitasTest {

	@Autowired
	private CitasRepository repository;
	
	private Cita cita;
	
	
	@Before
	public void init() {
		cita = new Cita();
		cita.setId((long)1);
		cita.setpacientId((long)1);
		cita.setdoctorId((long)1);
		cita.setnewDate("09-09-2019");
		cita.settime("14:00");
	}
	
	
	@Test
	@Sql(scripts = "/truncarTest.sql")
	@Sql(scripts = "/saveTest.sql")
	public void findByIdCitasRepositoryTest() {
		Optional<Cita> cit = repository.findById((long)1);
		Cita citaResult = cit.get();
		Cita citaExpected = cita;
		
		assertEquals(citaExpected.getId(),citaResult.getId());
		assertEquals(citaExpected.getpacientId(),citaResult.getpacientId());
		assertEquals(citaExpected.getdoctorId(),citaResult.getdoctorId());
		assertEquals(citaExpected.getnewDate(),citaResult.getnewDate());
		assertEquals(citaExpected.gettime(),citaResult.gettime());
//		assertEquals(citaExpected,citaResult);
		
	}
	
	@After
	@Sql(scripts = "/truncarTest.sql")
	public void finish() {

	}

}
