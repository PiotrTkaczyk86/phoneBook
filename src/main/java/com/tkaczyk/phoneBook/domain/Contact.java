package com.tkaczyk.phoneBook.domain;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

public class Contact {
	private int id;
	
	@NotNull
	private String firstName;
	
	@NotNull
	private String sureName;
	
	@Range(min=111111111, max=999999999)
	private int phone_number;
	
	private String city;
	
	private String address;
	
	private String zipCode;

	public Contact() {
		
	}

	public Contact(int id, @NotNull String firstName, @NotNull String sureName,
			@Range(min = 111111111, max = 999999999) int phone_number, String city, String address, String zipCode) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.sureName = sureName;
		this.phone_number = phone_number;
		this.city = city;
		this.address = address;
		this.zipCode = zipCode;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSureName() {
		return sureName;
	}

	public void setSureName(String sureName) {
		this.sureName = sureName;
	}

	public int getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(int phone_number) {
		this.phone_number = phone_number;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + id;
		result = prime * result + phone_number;
		result = prime * result + ((sureName == null) ? 0 : sureName.hashCode());
		result = prime * result + ((zipCode == null) ? 0 : zipCode.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contact other = (Contact) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (id != other.id)
			return false;
		if (phone_number != other.phone_number)
			return false;
		if (sureName == null) {
			if (other.sureName != null)
				return false;
		} else if (!sureName.equals(other.sureName))
			return false;
		if (zipCode == null) {
			if (other.zipCode != null)
				return false;
		} else if (!zipCode.equals(other.zipCode))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Contact [id=" + id + ", firstName=" + firstName + ", sureName=" + sureName + ", phone_number="
				+ phone_number + ", city=" + city + ", address=" + address + ", zipCode=" + zipCode + "]";
	}
	
	
}
