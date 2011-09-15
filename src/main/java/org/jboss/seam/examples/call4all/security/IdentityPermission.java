package org.jboss.seam.examples.call4all.security;

import static org.jboss.seam.security.annotations.permission.PermissionPropertyType.IDENTITY;
import static org.jboss.seam.security.annotations.permission.PermissionPropertyType.PERMISSION;
import static org.jboss.seam.security.annotations.permission.PermissionPropertyType.RELATIONSHIP_NAME;
import static org.jboss.seam.security.annotations.permission.PermissionPropertyType.RELATIONSHIP_TYPE;
import static org.jboss.seam.security.annotations.permission.PermissionPropertyType.RESOURCE;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import org.jboss.seam.security.annotations.permission.PermissionProperty;
import org.jboss.seam.security.annotations.permission.PermissionPropertyType;

@Entity
public class IdentityPermission implements Serializable {
	
	private Long id;
	private IdentityObject identityObject;
	private IdentityRelationshipType identityRelationshipType;
	private String relationshipName;
    private String resource;
    private String permission;
    
    @Id
    @GeneratedValue
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@NotNull
	@ManyToOne
	@PermissionProperty(IDENTITY)
	public IdentityObject getIdentityObject() {
		return identityObject;
	}
	public void setIdentityObject(IdentityObject identityObject) {
		this.identityObject = identityObject;
	}
	@ManyToOne
	@PermissionProperty(RELATIONSHIP_TYPE)
	public IdentityRelationshipType getIdentityRelationshipType() {
		return identityRelationshipType;
	}
	public void setIdentityRelationshipType(
			IdentityRelationshipType identityRelationshipType) {
		this.identityRelationshipType = identityRelationshipType;
	}
	@PermissionProperty(RELATIONSHIP_NAME)
	public String getRelationshipName() {
		return relationshipName;
	}
	public void setRelationshipName(String relationshipName) {
		this.relationshipName = relationshipName;
	}
	@PermissionProperty(RESOURCE)
	public String getResource() {
		return resource;
	}
	public void setResource(String resource) {
		this.resource = resource;
	}
	@PermissionProperty(PERMISSION)
	public String getPermission() {
		return permission;
	}
	public void setPermission(String permission) {
		this.permission = permission;
	}
    
    

}
