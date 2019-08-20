package com.crudAndres.crudAndres.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crudAndres.crudAndres.entity.Patient;

@Repository
public interface PatientRepository extends CrudRepository<Patient, Long>{

}
