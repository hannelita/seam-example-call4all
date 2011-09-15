package org.jboss.seam.examples.call4all.security;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.jboss.seam.security.annotations.management.EntityType;
import org.jboss.seam.security.annotations.management.IdentityEntity;
import org.jboss.seam.security.annotations.management.IdentityProperty;
import org.jboss.seam.security.annotations.management.PropertyType;
import org.joda.time.DateTime;

@Entity
@IdentityEntity(EntityType.IDENTITY_ATTRIBUTE)
public class IdentityAttribute implements Serializable {
	
	private Long id;
	private String name;
	private IdentityObject identityObject;
	private String value;
	
	
	
	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@IdentityProperty(PropertyType.NAME)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@ManyToOne
	public IdentityObject getIdentityObject() {
		return identityObject;
	}
	public void setIdentityObject(IdentityObject identityObject) {
		this.identityObject = identityObject;
	}
	@IdentityProperty(PropertyType.VALUE)
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	

}
