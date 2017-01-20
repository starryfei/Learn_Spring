package com.test.autowire;

public class Address {
	private String city;
	private String no;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", no=" + no + "]";
	}
}
