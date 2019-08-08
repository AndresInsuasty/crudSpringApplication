package com.crudAndres.crudAndres.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class PATIENTS implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column
	private Long id;

	@Column
	private String name;

	@Column
	private String lastName;

	@Column
	private String birthday;

	@Column
	private String identification;

	@Column
	private Long treatment;

	@Column
	private Long fee;

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
	@Override
	public String toString() {
		return "PACIENTS [id=" + id + ", name=" + name + ", lastName=" + lastName + ", birthday=" + birthday
				+ ", identification=" + identification + ", treatment=" + treatment + ", fee=" + fee + ", newDate="
				+ ", doctorsList=" + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((birthday == null) ? 0 : birthday.hashCode());
		result = prime * result + ((fee == null) ? 0 : fee.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((identification == null) ? 0 : identification.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((treatment == null) ? 0 : treatment.hashCode());
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
		PATIENTS other = (PATIENTS) obj;
		if (birthday == null) {
			if (other.birthday != null)
				return false;
		} 
		else if (!birthday.equals(other.birthday))
			return false;
		if (fee == null) {
			if (other.fee != null)
				return false;
		} 
		else if (!fee.equals(other.fee))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} 
		else if (!id.equals(other.id))
			return false;
		if (identification == null) {
			if (other.identification != null)
				return false;
		} 
		else if (!identification.equals(other.identification))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} 
		else if (!lastName.equals(other.lastName))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} 
		else if (!name.equals(other.name))
			return false;

		if (treatment == null) {
			if (other.treatment != null)
				return false;
		} 
		else if (!treatment.equals(other.treatment))
			return false;
		return true;
	}

}
