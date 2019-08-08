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
	private Long pacientId;
	
	@Column
	private Long doctorId;
	
	@Column
	private String newDate;
	
	@Column
	private String time;
	
	@Override
	public String toString() {
		return "CITAS [id=" + id + ", pacientId=" + pacientId + ", doctorId=" + doctorId + ", newDate=" + newDate
				+ ", time=" + time + "]";
	}

	public CITAS(Long id, Long pacientID, Long doctorID, String newDate1, String tIme) {
		super();
		this.id = id;
		pacientId = pacientID;
		doctorId = doctorID;
		newDate = newDate1;
		time = tIme;
	}
	public CITAS() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getnewDate() {
		return newDate;
	}

	public void setnewDate(String newDate1) {
		newDate = newDate1;
	}

	public String gettime() {
		return time;
	}

	public void settime(String tIme) {
		time = tIme;
	}

	public Long getpacientId() {
		return pacientId;
	}

	public void setpacientId(Long pacientID) {
		pacientId = pacientID;
	}

	public Long getdoctorId() {
		return doctorId;
	}

	public void setdoctorId(Long doctorID) {
		doctorId = doctorID;
	}
	

}
