package com.Bridgelabz.model;

public class Address {
	@Override
	public String toString() {
      return("address [addressLocal="+ addressLocal +",city=" +city + ",state="+ state + ",zip=" + zip+" ]");
		
	}
	private String addressLocal;
	private String city;
	private String state;
	private int zip;
	public String getAddressLocal() {
		return addressLocal;
	}
	public void setAddressLocal(String addressLocal) {
		this.addressLocal = addressLocal;
	}
	public Address(String addressLocal, String city, String state, int zip) {
		super();
		this.addressLocal = addressLocal;
		this.city = city;
		this.state = state;
		this.zip = zip;
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
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	/*
	 * public static void main(String[] args) { Address ad= new Address();
	 * System.out.println(ad); }
	 */

}


