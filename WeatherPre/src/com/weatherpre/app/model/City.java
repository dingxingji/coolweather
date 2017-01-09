package com.weatherpre.app.model;

public class City {
	private int id;
	private int provinceId;
	private String cityName;
	private String cityCode;
	
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public int getProvinceId() {
		return provinceId;
	}



	public void setProvinceId(int provinceId) {
		this.provinceId = provinceId;
	}



	public String getCityName() {
		return cityName;
	}



	public void setCityName(String cityName) {
		this.cityName = cityName;
	}



	public String getCityCode() {
		return cityCode;
	}



	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}



	@Override
	public String toString() {
		return "City [id=" + id + ", provinceId=" + provinceId + ", cityName="
				+ cityName + ", cityCode=" + cityCode + "]";
	}



	public static void main(String[] args) {
	}
}
