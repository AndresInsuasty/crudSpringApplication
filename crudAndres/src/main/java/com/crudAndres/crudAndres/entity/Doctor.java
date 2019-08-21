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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + ((consultingRoom == null) ? 0 : consultingRoom.hashCode());
		result = prime * result + ((domicile == null) ? 0 : domicile.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((specialty == null) ? 0 : specialty.hashCode());
		result = prime * result + ((years == null) ? 0 : years.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Doctor other = (Doctor) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (consultingRoom == null) {
			if (other.consultingRoom != null)
				return false;
		} else if (!consultingRoom.equals(other.consultingRoom))
			return false;
		if (domicile == null) {
			if (other.domicile != null)
				return false;
		} else if (!domicile.equals(other.domicile))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (specialty == null) {
			if (other.specialty != null)
				return false;
		} else if (!specialty.equals(other.specialty))
			return false;
		if (years == null) {
			if (other.years != null)
				return false;
		} else if (!years.equals(other.years))
			return false;
		return true;
	}


}
