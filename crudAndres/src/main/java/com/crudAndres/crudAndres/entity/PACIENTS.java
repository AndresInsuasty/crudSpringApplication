package com.crudAndres.crudAndres.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class PACIENTS implements Serializable{

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
	
	@ManyToMany(cascade = {CascadeType.ALL})
	@JoinTable(name="CITAS", 
	joinColumns=@JoinColumn(name="pacient_id"),
	inverseJoinColumns= {@JoinColumn(name="doctor_id")})
	private Set<DOCTORS> doctorsList;

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



	public Set<DOCTORS> getDoctorsList() {
		return doctorsList;
	}

	public void setDoctorsList(Set<DOCTORS> doctorsList) {
		this.doctorsList = doctorsList;
	}

	@Override
	public String toString() {
		return "PACIENTS [id=" + id + ", name=" + name + ", lastName=" + lastName + ", birthday=" + birthday
				+ ", identification=" + identification + ", treatment=" + treatment + ", fee=" + fee + ", newDate="
				+", doctorsList=" + doctorsList + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((birthday == null) ? 0 : birthday.hashCode());
		result = prime * result + ((doctorsList == null) ? 0 : doctorsList.hashCode());
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
		PACIENTS other = (PACIENTS) obj;
		if (birthday == null) {
			if (other.birthday != null)
				return false;
		} else if (!birthday.equals(other.birthday))
			return false;
		if (doctorsList == null) {
			if (other.doctorsList != null)
				return false;
		} else if (!doctorsList.equals(other.doctorsList))
			return false;
		if (fee == null) {
			if (other.fee != null)
				return false;
		} else if (!fee.equals(other.fee))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (identification == null) {
			if (other.identification != null)
				return false;
		} else if (!identification.equals(other.identification))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;

		if (treatment == null) {
			if (other.treatment != null)
				return false;
		} else if (!treatment.equals(other.treatment))
			return false;
		return true;
	}
	
	
	
	
	

}
