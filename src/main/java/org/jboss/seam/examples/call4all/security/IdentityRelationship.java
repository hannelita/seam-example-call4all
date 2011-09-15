package org.jboss.seam.examples.call4all.security;

import java.io.Serializable;

import javax.persistence.Entity;

import org.jboss.seam.security.annotations.management.EntityType;
import org.jboss.seam.security.annotations.management.IdentityEntity;

@Entity
@IdentityEntity(EntityType.IDENTITY_RELATIONSHIP)
public class IdentityRelationship implements Serializable {
	
	private Long id;
	private String name;
	private IdentityObject from;
	private IdentityObject to;
	private IdentityRelationshipType identityRelationShipType;
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
	public IdentityObject getFrom() {
		return from;
	}
	public void setFrom(IdentityObject from) {
		this.from = from;
	}
	public IdentityObject getTo() {
		return to;
	}
	public void setTo(IdentityObject to) {
		this.to = to;
	}
	public IdentityRelationshipType getIdentityRelationShipType() {
		return identityRelationShipType;
	}
	public void setIdentityRelationShipType(
			IdentityRelationshipType identityRelationShipType) {
		this.identityRelationShipType = identityRelationShipType;
	}

	

}
