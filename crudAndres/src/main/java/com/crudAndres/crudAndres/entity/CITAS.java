package com.crudAndres.crudAndres.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CITAS implements Serializable{
	
	private static final long serialVersionUID=1L;
	
	@Id
	@GeneratedValue
	private Long id;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column
	private Long PACIENT_ID;
	
	@Column
	private Long DOCTOR_ID;

	@Override
	public String toString() {
		return "CITAS [PACIENT_ID=" + PACIENT_ID + ", DOCTOR_ID=" + DOCTOR_ID + "]";
	}


	public CITAS(Long id, Long pACIENT_ID, Long dOCTOR_ID) {
		super();
		this.id = id;
		PACIENT_ID = pACIENT_ID;
		DOCTOR_ID = dOCTOR_ID;
	}

	public Long getPACIENT_ID() {
		return PACIENT_ID;
	}

	public void setPACIENT_ID(Long pACIENT_ID) {
		PACIENT_ID = pACIENT_ID;
	}

	public Long getDOCTOR_ID() {
		return DOCTOR_ID;
	}

	public void setDOCTOR_ID(Long dOCTOR_ID) {
		DOCTOR_ID = dOCTOR_ID;
	}
	

}
