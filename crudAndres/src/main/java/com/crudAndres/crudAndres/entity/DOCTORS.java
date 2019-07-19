//package com.crudAndres.crudAndres.entity;
//
//import java.io.Serializable;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//@Entity
////@Table(name="DOCTORS")
//public class DOCTORS implements Serializable{
//	public DOCTORS() {
//		
//	}
//	
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;
//
//	@GeneratedValue
//	@Id
//	@Column(name="ID_DOCTOR")
//	private Long id;
//	
//	@Column(name="CODE")
//	private String code;
//	
//	@Column(name="SPECIALTY")
//	private String specialty;
//	
//	@Column(name="YEARS")
//	private Long years;
//	
//	@Column(name="CONSULTING_ROOM")
//	private String consultingRoom;
//	
//	@Column(name="DOMICILE")
//	private String domicile;
//
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	public String getCode() {
//		return code;
//	}
//
//	public void setCode(String code) {
//		this.code = code;
//	}
//
//	public String getSpecialty() {
//		return specialty;
//	}
//
//	public void setSpecialty(String specialty) {
//		this.specialty = specialty;
//	}
//
//	public Long getYears() {
//		return years;
//	}
//
//	public void setYears(Long years) {
//		this.years = years;
//	}
//
//	public String getConsultingRoom() {
//		return consultingRoom;
//	}
//
//	public void setConsultingRoom(String consultingRoom) {
//		this.consultingRoom = consultingRoom;
//	}
//
//	public String getDomicile() {
//		return domicile;
//	}
//
//	public void setDomicile(String domicile) {
//		this.domicile = domicile;
//	}
//
//	public DOCTORS(Long id, String code, String specialty, Long years, String consultingRoom, String domicile) {
//		this.id = id;
//		this.code = code;
//		this.specialty = specialty;
//		this.years = years;
//		this.consultingRoom = consultingRoom;
//		this.domicile = domicile;
//	}
//	
//
//}
