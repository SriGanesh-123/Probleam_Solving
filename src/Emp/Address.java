package Emp;

public class Address {
	private String StreetName;
	private String city;
	private String State;
	private long pincode;
	
	public String toString() {
		return getStreetName() + " " + getCity() + " " + getState() + " " + getPincode();
	}
	public String getStreetName() {
		return StreetName;
	}
	public void setStreetName(String streetName) {
		StreetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}


	

}
