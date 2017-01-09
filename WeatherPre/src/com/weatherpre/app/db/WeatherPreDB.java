package com.weatherpre.app.db;

import java.util.ArrayList;
import java.util.List;

import com.weatherpre.app.model.City;
import com.weatherpre.app.model.County;
import com.weatherpre.app.model.Province;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class WeatherPreDB {

	public static final String DB_NAME = "cool_weather"; 
	public static final int VERSION = 1;
	private static WeatherPreDB weatherPreDB;
	private SQLiteDatabase db;
	
	
	//方法私有
	private WeatherPreDB(Context context) {
		WeatherpreOpenHelper weatherpreOpenHelper = new WeatherpreOpenHelper(context,DB_NAME, null, VERSION);
		db = weatherpreOpenHelper.getWritableDatabase();
	}
	
	//获取db实例
	public synchronized static  WeatherPreDB getInstance(Context context) {
		
		if(weatherPreDB != null){
			weatherPreDB = new WeatherPreDB(context);
		}
		return weatherPreDB;
		
	}
	
	//将province 实例存储 数据库
	public void saveProvince(Province province) {
		if(province != null){
			ContentValues contentValues = new ContentValues();
			contentValues.put("province_name",province.getProvinceName());
			contentValues.put("province_code",province.getProvinceCode());
			db.insert("Province", null, contentValues);
		}
	}
	
	//从数据库读取全国省份信息
	public List<Province> loadProvinces(){
		List<Province> list = new ArrayList<Province>();
		Cursor cursor = db.query("Province",null,null,null,null,null,null);
		if(cursor.moveToFirst()){
			do {
				Province province = new Province();
				province.setId(cursor.getInt(cursor.getColumnIndex("id")));
				province.setProvinceName(cursor.getString(cursor.getColumnIndex("province_name")));
				province.setProvinceCode(cursor.getString(cursor.getColumnIndex("province_code")));
				list.add(province);
			} while (cursor.moveToNext());
		}
		if(cursor != null){
			cursor.close();
		}
		return list;
	}
	//city 实例存储到db
	public void saveCity(City city) {
		if(city != null){
			ContentValues contentValues = new ContentValues();
			contentValues.put("city_name",city.getCityName());
			contentValues.put("city_code",city.getCityCode());
			db.insert("City", null, contentValues);
		}
	}
	
	
	//读取省份城市
	public List<City> loadCities(){
		List<City> list = new ArrayList<City>();
		Cursor cursor = db.query("City",null,null,null,null,null,null);
		if(cursor.moveToFirst()){
			do {
				City city = new City();
				city.setId(cursor.getInt(cursor.getColumnIndex("id")));
				city.setCityName(cursor.getString(cursor.getColumnIndex("city_name")));
				city.setCityCode(cursor.getString(cursor.getColumnIndex("city_code")));
				list.add(city);
			} while (cursor.moveToNext());
		}
		if(cursor != null){
			cursor.close();
		}
		return list;
	}
	
	//county 实例存储到db
	public void saveCounties(County county) {
		if(county != null){
			ContentValues contentValues = new ContentValues();
			contentValues.put("county_name",county.getCountyName());
			contentValues.put("county_code",county.getCountyCode());
			db.insert("County", null, contentValues);
		}
	}
	
	
	//读取省份城市
	public List<County> loadCounties(){
		List<County> list = new ArrayList<County>();
		Cursor cursor = db.query("County",null,null,null,null,null,null);
		if(cursor.moveToFirst()){
			do {
				County county = new County();
				county.setId(cursor.getInt(cursor.getColumnIndex("id")));
				county.setCountyName(cursor.getString(cursor.getColumnIndex("county_name")));
				county.setCountyCode(cursor.getString(cursor.getColumnIndex("county_code")));
				list.add(county);
			} while (cursor.moveToNext());
		}
		if(cursor != null){
			cursor.close();
		}
		return list;
	}
	
	
}
