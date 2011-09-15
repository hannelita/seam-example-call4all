package org.jboss.seam.examples.call4all.security;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.jboss.seam.security.annotations.management.IdentityProperty;
import org.jboss.seam.security.annotations.management.PropertyType;

@Entity
public class IdentityType implements Serializable {
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
	@IdentityProperty(PropertyType.NAME)
	public String getValue() {
		return name;
	}
	public void setValue(String value) {
		this.name = value;
	}

}
