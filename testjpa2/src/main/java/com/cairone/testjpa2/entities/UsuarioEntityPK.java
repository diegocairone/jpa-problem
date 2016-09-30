package com.cairone.testjpa2.entities;

import java.io.Serializable;
import javax.persistence.*;

@Embeddable
public class UsuarioEntityPK implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private PersonaRelPKEntity personaRelPKEntity = null;
	
	@Column(name="per_tipo_usu", insertable=false, updatable=false)
	private Integer perTipoUsu;

	@Column(name="per_cod_usu", insertable=false, updatable=false)
	private Integer perCodUsu;

	public UsuarioEntityPK() {
		this.personaRelPKEntity = new PersonaRelPKEntity();
	}
	
	public Integer getPerTipoUsu() {
		return this.perTipoUsu;
	}
	
	public void setPerTipoUsu(Integer perTipoUsu) {
		this.perTipoUsu = perTipoUsu;
		this.personaRelPKEntity.setPerTipo(perTipoUsu);
	}
	
	public Integer getPerCodUsu() {
		return this.perCodUsu;
	}
	
	public void setPerCodUsu(Integer perCodUsu) {
		this.perCodUsu = perCodUsu;
		this.personaRelPKEntity.setPerCod(perCodUsu);
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof UsuarioEntityPK)) {
			return false;
		}
		UsuarioEntityPK castOther = (UsuarioEntityPK)other;
		return 
			(this.perTipoUsu == castOther.perTipoUsu)
			&& (this.perCodUsu == castOther.perCodUsu);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.perTipoUsu;
		hash = hash * prime + this.perCodUsu;
		
		return hash;
	}
}