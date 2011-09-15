package org.jboss.seam.examples.call4all.security;

import static org.jboss.seam.security.annotations.management.EntityType.IDENTITY_ROLE_NAME;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.jboss.seam.security.annotations.management.EntityType;
import org.jboss.seam.security.annotations.management.IdentityEntity;

@Entity
@IdentityEntity(IDENTITY_ROLE_NAME)
public class IdentityRole implements Serializable {
	
	private Long id;
	private String name;
	
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
	
	


}
