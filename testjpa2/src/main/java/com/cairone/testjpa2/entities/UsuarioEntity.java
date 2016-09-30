package com.cairone.testjpa2.entities;

import java.io.Serializable;
import javax.persistence.*;

@Entity @Table(name="usuarios")
public class UsuarioEntity implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private UsuarioEntityPK id;
	
	@OneToOne @MapsId("personaRelPKEntity") @JoinColumns({
		@JoinColumn(name = "per_tipo_usu", referencedColumnName = "per_tipo", insertable = false, updatable = false),
		@JoinColumn(name = "per_cod_usu", referencedColumnName = "per_cod", insertable = false, updatable = false)
	})
	private PersonaRelEntity personaRelEntity = null;

	private String username;

	public UsuarioEntity() {
		this.id = new UsuarioEntityPK();
	}

	public UsuarioEntityPK getId() {
		return this.id;
	}

	public void setId(UsuarioEntityPK id) {
		this.id = id;
	}

	public PersonaRelEntity getPersonaRelEntity() {
		return personaRelEntity;
	}

	public void setPersonaRelEntity(PersonaRelEntity personaRelEntity) {
		this.personaRelEntity = personaRelEntity;
		this.id.setPerCodUsu(personaRelEntity.getId().getPerCod());
		this.id.setPerTipoUsu(personaRelEntity.getId().getPerTipo());
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}