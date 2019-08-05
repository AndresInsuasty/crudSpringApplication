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
	
	@Column
	private Long PACIENT_ID;
	
	@Column
	private Long DOCTOR_ID;
	
	@Column
	private String NewDate;
	
	@Column
	private String Time;
	
	@Override
	public String toString() {
		return "CITAS [id=" + id + ", PACIENT_ID=" + PACIENT_ID + ", DOCTOR_ID=" + DOCTOR_ID + ", NewDate=" + NewDate
				+ ", Time=" + Time + "]";
	}

	public CITAS(Long id, Long pACIENT_ID, Long dOCTOR_ID, String newDate, String time) {
		super();
		this.id = id;
		PACIENT_ID = pACIENT_ID;
		DOCTOR_ID = dOCTOR_ID;
		NewDate = newDate;
		Time = time;
	}
	public CITAS() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNewDate() {
		return NewDate;
	}

	public void setNewDate(String newDate) {
		NewDate = newDate;
	}

	public String getTime() {
		return Time;
	}

	public void setTime(String time) {
		Time = time;
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
