package com.example.skytrainvancouver;

import java.util.ArrayList;

public class Station {
	private int id;
	private String name;
	private String line[] = new String[3];
	private int fareZone;
	private ArrayList<InterestPoint> points;
	
	Station(int id,String name, String line[], int zone){
		this.setId(id);
		this.name = name;
		this.line = line;
		this.fareZone = zone;
		setPoints(new ArrayList<InterestPoint>());
	
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getLine() {
		return line;
	}
	public void setLine(String[] line) {
		this.line = line;
	}
	public int getFareZone() {
		return fareZone;
	}
	public void setFareZone(int fareZone) {
		this.fareZone = fareZone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ArrayList<InterestPoint> getPoints() {
		return points;
	}

	public void setPoints(ArrayList<InterestPoint> points) {
		this.points = points;
	}
	
	public String showInfo(){
		String lines ="";
		for(int i = 0 ;i< line.length ; i++)
			lines+=(line[i]+" ");
		return "Zone: "+getFareZone()+" "+lines;
	}
	

}
