package com.crudAndres.crudAndres.model;

public class CitasModel {
	Long id;
	Long pacientId;
	Long doctorId;
	String newDate;
	String time;
	public CitasModel(Long id, Long pacientId, Long doctorId, String newDate, String time) {
		super();
		this.id = id;
		this.pacientId = pacientId;
		this.doctorId = doctorId;
		this.newDate = newDate;
		this.time = time;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getPacientId() {
		return pacientId;
	}
	public void setPacientId(Long pacientId) {
		this.pacientId = pacientId;
	}
	public Long getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(Long doctorId) {
		this.doctorId = doctorId;
	}
	public String getNewDate() {
		return newDate;
	}
	public void setNewDate(String newDate) {
		this.newDate = newDate;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
}
