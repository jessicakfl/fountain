package com.restboot.service;

public class BranchLocation {

private String branchName;
private String latitude;
private String longtitude;
private String streeAaddress;
private String city;
private String countrySubDivision;
private String country;
private String postCode;


public BranchLocation(String branchName, String latitude, String longtitude, String streeAaddress, String city,
		String countrySubDivision, String country, String postCode) {
	super();
	this.branchName = branchName;
	this.latitude = latitude;
	this.longtitude = longtitude;
	this.streeAaddress = streeAaddress;
	this.city = city;
	this.countrySubDivision = countrySubDivision;
	this.country = country;
	this.postCode = postCode;
}

public String getBranchName() {
	return branchName;
}

public void setBranchName(String branchName) {
	this.branchName = branchName;
}

public String getLatitude() {
	return latitude;
}

public void setLatitude(String latitude) {
	this.latitude = latitude;
}

public String getLongtitude() {
	return longtitude;
}

public void setLongtitude(String longtitude) {
	this.longtitude = longtitude;
}

public String getStreeAaddress() {
	return streeAaddress;
}

public void setStreeAaddress(String streeAaddress) {
	this.streeAaddress = streeAaddress;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getCountrySubDivision() {
	return countrySubDivision;
}

public void setCountrySubDivision(String countrySubDivision) {
	this.countrySubDivision = countrySubDivision;
}

public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
}

public String getPostCode() {
	return postCode;
}

public void setPostCode(String postCode) {
	this.postCode = postCode;
}

}