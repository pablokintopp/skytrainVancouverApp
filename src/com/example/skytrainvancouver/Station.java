package com.example.skytrainvancouver;

public class Station {
	private String name;
	private String line[] = new String[3];
	private int fareZone;
	
	Station(String name, String line[], int zone){
		this.name = name;
		this.line = line;
		this.fareZone = zone;
	
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
	
	

}
