package com.project.beans;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class ProductRegistration {
	
	private String registrationId;
	@NotEmpty
	@Pattern(regexp="[^0-9]*")
	private String lastname;
	@Pattern(regexp="[^0-9]*")
	private String firstname;
	@NotEmpty
	@Email
	private String email;
	@Pattern(regexp="[^a-z]*")
	@Size(max=10, min=10)
	private String phoneNumber;
	@NotEmpty
	private String addressLine1;
	private String addressLine2;
	@NotEmpty
	private String city;
	@NotEmpty
	private String state;
	@Pattern(regexp="[^a-z]*")
	@Size(max=5, min=5)
	private String zipCode;
	@NotEmpty
	private String country;
	@NotEmpty
	private String modelName;
	@NotEmpty
	private String productId;
	@NotEmpty
	private String purchasedFrom;
	@NotEmpty
	private String purchaseDate;
	
	public String getRegistrationId() {
		return registrationId;
	}
	public void setRegistrationId(String registrationId) {
		this.registrationId = registrationId;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getPurchasedFrom() {
		return purchasedFrom;
	}
	public void setPurchasedFrom(String purchasedFrom) {
		this.purchasedFrom = purchasedFrom;
	}
	public String getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
}
