package com.contact.model;

public class Inquiry {
	
	private String id;
	private String name;
	private String email;
	private String city;
	private String description;

public Inquiry(String id,String name,String email,String city,String description) {
	
	this.id = id;
	this.name = name;
	this.email = email;
	this.city = city;
	this.description = description;
}

public Inquiry(String name, String email, String city, String description) {
	this.name = name;
	this.email = email;
	this.city = city;
	this.description = description;
}


public Inquiry() {
	// TODO Auto-generated constructor stub
	this.name = "default name";
	this.email = "default@email.com";
	this.city = "default city";
	this.description = "default description";
}

/**
 * @return the id
 */
public String getId() {
	return id;
}

/**
 * @param id the id to set
 */
public void setId(String id) {
	this.id = id;
}

/**
 * @return the id
 */

public String getName() {
	return name;
}

/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}

/**
 * @return the email
 */
public String getEmail() {
	return email;
}

/**
 * @param email the email to set
 */
public void setEmail(String email) {
	this.email = email;
}

/**
 * @return the city
 */
public String getCity() {
	return city;
}

/**
 * @param city the city to set
 */
public void setCity(String city) {
	this.city = city;
}

/**
 * @return the description
 */
public String getDescription() {
	return description;
}

/**
 * @param description the description to set
 */
public void setDescription(String description) {
	this.description = description;
}

@Override
public String toString() {
	return "Inquiry [" + (name != null ? "name=" + name + ", " : "") + (email != null ? "email=" + email + ", " : "")
			+ (city != null ? "city=" + city + ", " : "") + (description != null ? "description=" + description : "")
			+ "]";
}



}
