package com.crudAndres.crudAndres.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crudAndres.crudAndres.entity.PATIENTS;

@Repository
public interface PacientRepository extends CrudRepository<PATIENTS, Long>{

}
