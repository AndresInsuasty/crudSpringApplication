package com.crudAndres.crudAndres.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name ="CITAS")
public class Cita implements Serializable{
	
	private static final long serialVersionUID=1L;
	
	@Id
//	@GeneratedValue // este comando continua la secuencia y para los test necesito que no se continue porque cambia el ID que establezco
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

	public Cita(Long id, Long pacientID, Long doctorID, String newDate1, String tIme) {
		super();
		this.id = id;
		pacientId = pacientID;
		doctorId = doctorID;
		newDate = newDate1;
		time = tIme;
	}
	public Cita() {
		
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((doctorId == null) ? 0 : doctorId.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((newDate == null) ? 0 : newDate.hashCode());
		result = prime * result + ((pacientId == null) ? 0 : pacientId.hashCode());
		result = prime * result + ((time == null) ? 0 : time.hashCode());
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
		Cita other = (Cita) obj;
		if (doctorId == null) {
			if (other.doctorId != null)
				return false;
		} else if (!doctorId.equals(other.doctorId))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (newDate == null) {
			if (other.newDate != null)
				return false;
		} else if (!newDate.equals(other.newDate))
			return false;
		if (pacientId == null) {
			if (other.pacientId != null)
				return false;
		} else if (!pacientId.equals(other.pacientId))
			return false;
		if (time == null) {
			if (other.time != null)
				return false;
		} else if (!time.equals(other.time))
			return false;
		return true;
	}
	

}
