package org.jboss.seam.examples.call4all.security;

import static org.jboss.seam.security.annotations.management.EntityType.IDENTITY_ATTRIBUTE;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.jboss.seam.security.annotations.management.EntityType;
import org.jboss.seam.security.annotations.management.IdentityEntity;
import org.joda.time.DateTime;

@Entity
@IdentityEntity(IDENTITY_ATTRIBUTE)
public class IdentityType implements Serializable {
	
	private Long id;
	private String name;
	private String email;
	private DateTime born;
	private IdentityObject identityObject;
	
	
	
	@Id
	@GeneratedValue
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public DateTime getBorn() {
		return born;
	}
	public void setBorn(DateTime born) {
		this.born = born;
	}
	@ManyToOne
	public IdentityObject getIdentityObject() {
		return identityObject;
	}
	public void setIdentityObject(IdentityObject identityObject) {
		this.identityObject = identityObject;
	}
	
	
	

}
