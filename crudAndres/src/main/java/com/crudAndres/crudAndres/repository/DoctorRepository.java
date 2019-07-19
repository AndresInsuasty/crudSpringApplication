 package com.crudAndres.crudAndres.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crudAndres.crudAndres.entity.DOCTORS;

@Repository
public interface DoctorRepository extends CrudRepository<DOCTORS, Long>{
	
	

}
