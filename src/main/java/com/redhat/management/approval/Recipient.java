package com.redhat.management.approval;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Recipient implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.String name;
	private java.lang.String email;

	public Recipient() {
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public java.lang.String getEmail() {
		return this.email;
	}

	public void setEmail(java.lang.String email) {
		this.email = email;
	}

	public java.lang.String toString() {
		//return "\"" + name + "\" \"" + email + "\"";
		return email;
	}

	public Recipient(java.lang.String name, java.lang.String email) {
		this.name = name;
		this.email = email;
	}

}