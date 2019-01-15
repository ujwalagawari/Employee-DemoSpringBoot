/**
 * 
 */
package com.cg.rest.employeedemo.entity;

import javax.persistence.Embeddable;

/**
 * @author ugawari
 *
 */
@Embeddable
public class Address {

	private int flatNo;
	private String street;
	private String city;
	private String state;
	private int pincode;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	

	public Address() {
		super();
	}

	public int getFlatNo() {
		return flatNo;
	}

	public void setFlatNo(int flatNo) {
		this.flatNo = flatNo;
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

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	
	@Override
	public String toString() {
		return "Address [flatNo=" + flatNo + ", street=" + street + ", city=" + city + ", state=" + state + ", pincode="
				+ pincode + "]";
	}
	
}
