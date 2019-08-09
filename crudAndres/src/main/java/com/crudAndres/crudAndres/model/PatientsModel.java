package com.crudAndres.crudAndres.model;

public class PatientsModel {
	Long id;
	String name;
	String lastName;
	String birthday;
	String identification;
	Long treatment;
	Long fee;
	public PatientsModel(Long id, String name, String lastName, String birthday, String identification, Long treatment,
			Long fee) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.birthday = birthday;
		this.identification = identification;
		this.treatment = treatment;
		this.fee = fee;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getIdentification() {
		return identification;
	}
	public void setIdentification(String identification) {
		this.identification = identification;
	}
	public Long getTreatment() {
		return treatment;
	}
	public void setTreatment(Long treatment) {
		this.treatment = treatment;
	}
	public Long getFee() {
		return fee;
	}
	public void setFee(Long fee) {
		this.fee = fee;
	}
	
}
