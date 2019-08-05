package com.crudAndres.crudAndres.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crudAndres.crudAndres.entity.CITAS;

@Repository
public interface CitasRepository extends JpaRepository<CITAS,Long>{

}
