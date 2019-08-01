 package com.crudAndres.crudAndres.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.crudAndres.crudAndres.entity.DOCTORS;

@Repository
// public interface DoctorRepository extends CrudRepository<DOCTORS, Long>{
public interface DoctorRepository extends JpaRepository<DOCTORS, Long>{
	
	

}
