package com.example.skytrainvancouver;

public class InterestPoint {
	private int idImg;
	private String name;
	
	InterestPoint(int id,String name){
		this.idImg = id;
		this.name = name;
		
	}
	public int getIdImg() {
		return idImg;
	}
	public void setIdImg(int idImg) {
		this.idImg = idImg;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
