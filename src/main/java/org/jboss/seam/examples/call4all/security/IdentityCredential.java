package org.jboss.seam.examples.call4all.security;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class IdentityCredential {
	
	private Long id;
	private String value;
	private IdentityObject identityObject;
	private IdentityCredentialType identityCredentialType;
	
	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public IdentityObject getIdentityObject() {
		return identityObject;
	}
	public void setIdentityObject(IdentityObject identityObject) {
		this.identityObject = identityObject;
	}
	public IdentityCredentialType getIdentityCredentialType() {
		return identityCredentialType;
	}
	public void setIdentityCredentialType(
			IdentityCredentialType identityCredentialType) {
		this.identityCredentialType = identityCredentialType;
	}
	
	

}
