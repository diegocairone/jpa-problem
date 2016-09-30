package com.cairone.testjpa2.entities;

import java.io.Serializable;
import javax.persistence.*;

@Embeddable
public class PersonaRelPKEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Column(name="per_tipo")
	private Integer perTipo;

	@Column(name="per_cod")
	private Integer perCod;

	public PersonaRelPKEntity() {}
	
	public Integer getPerTipo() {
		return this.perTipo;
	}
	
	public void setPerTipo(Integer perTipo) {
		this.perTipo = perTipo;
	}
	
	public Integer getPerCod() {
		return this.perCod;
	}
	
	public void setPerCod(Integer perCod) {
		this.perCod = perCod;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PersonaRelPKEntity)) {
			return false;
		}
		PersonaRelPKEntity castOther = (PersonaRelPKEntity)other;
		return 
			(this.perTipo == castOther.perTipo)
			&& (this.perCod == castOther.perCod);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.perTipo;
		hash = hash * prime + this.perCod;
		
		return hash;
	}
}