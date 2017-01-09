package com.weatherpre.app.model;

public class County {
	private int id;
	private int cityId;
	private String countyName;
	private String countyCode;
	
	
	
	
	
	public int getId() {
		return id;
	}





	public void setId(int id) {
		this.id = id;
	}





	public int getCityId() {
		return cityId;
	}





	public void setCityId(int cityId) {
		this.cityId = cityId;
	}





	public String getCountyName() {
		return countyName;
	}





	public void setCountyName(String countyName) {
		this.countyName = countyName;
	}





	public String getCountyCode() {
		return countyCode;
	}





	public void setCountyCode(String countyCode) {
		this.countyCode = countyCode;
	}





	@Override
	public String toString() {
		return "County [id=" + id + ", cityId=" + cityId + ", countyName="
				+ countyName + ", countyCode=" + countyCode + "]";
	}





	public static void main(String[] args) {
	}

}
