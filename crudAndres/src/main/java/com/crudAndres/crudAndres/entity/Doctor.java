package com.crudAndres.crudAndres.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="DOCTORS")
public class Doctor{
	public Doctor() {
		
	}
	
	
	@Id
	@GeneratedValue
	@Column(name="ID")
	private Long id;
	
	@Column(name="CODE")
	private String code;
	
	@Column(name="SPECIALTY")
	private String specialty;
	
	@Column(name="YEARS")
	private Long years;
	
	@Column(name="CONSULTING_ROOM")
	private String consultingRoom;
	
	@Column(name="DOMICILE")
	private String domicile;
	
	

	public Doctor(Long id, String code, String specialty, Long years, String consultingRoom, String domicile) {
		super();
		this.id = id;
		this.code = code;
		this.specialty = specialty;
		this.years = years;
		this.consultingRoom = consultingRoom;
		this.domicile = domicile;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	public Long getYears() {
		return years;
	}

	public void setYears(Long years) {
		this.years = years;
	}

	public String getConsultingRoom() {
		return consultingRoom;
	}

	public void setConsultingRoom(String consultingRoom) {
		this.consultingRoom = consultingRoom;
	}

	public String getDomicile() {
		return domicile;
	}

	public void setDomicile(String domicile) {
		this.domicile = domicile;
	}


}