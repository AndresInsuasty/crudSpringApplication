package com.crudAndres.crudAndres.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crudAndres.crudAndres.entity.PACIENTS;

@Repository
public interface PacientRepository extends CrudRepository<PACIENTS, Long>{

}
