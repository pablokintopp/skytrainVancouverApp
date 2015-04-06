package com.example.skytrainvancouver;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class PathResult extends Activity {
	ArrayList<Station> pathStation; ;
	int origin, destination;
	ArrayList<String> stationNames;
	ListView listView;
	CustomAdapter adapter;
	TextView txtTitle, txtTime, txtPrice;
	boolean zones[]={false,false,false,false}; // 0 ==airport , zone 1 , 2 , 3
	double zonePrice[];
	int timeStoped;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_result_path);
		
		pathStation = new ArrayList<Station>();
		zonePrice = new double[4];
		zonePrice[0] = 5; //airport zone tax for leaving the area
		zonePrice[1] = 2.75; // pass by 1 zone
		zonePrice[2] = 4; // pass by 2 zones
		zonePrice[3] = 5.5;  // pass by 3 zones
		
		
		txtTitle = (TextView) findViewById(R.id.textViewInfo);
		txtTime = (TextView) findViewById(R.id.textViewTime);
		txtPrice = (TextView) findViewById(R.id.textViewPrice);
		
		//loading parameters
		Bundle b = getIntent().getExtras();	
		origin = b.getInt("origin");
		destination = b.getInt("destination");
		
		//loading the stations which belong to the path selected
		loadPath(origin, destination);
		
		//getting the stations names from the array of stations
		stationNames = loadStationNames();
		
		//setting the time skytrains will be stopped in the stations
		timeStoped = (stationNames.size() > 2) ?  stationNames.size()-1 : 0; 
		
		//updating textFields information
			txtTitle.setText("From "+stationNames.get(0)+" to "+stationNames.get(stationNames.size()-1));
			txtPrice.setText("Price estimated: "+loadPrice());
			txtTime.setText("Time estimated: "+loadTime(origin, destination));
		
		//setting the names on the listView
		listView = (ListView) findViewById(R.id.listViewResult);
		adapter = new CustomAdapter(this, R.layout.list_view_design, pathStation);

		listView.setAdapter(adapter);
		
		listView.setOnItemClickListener(new OnItemClickListener(){

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				
				Intent i = new Intent(PathResult.this,StationActivity.class);
				
				//creating parameters
				int idStation = pathStation.get(position).getId();
				
				i.putExtra("id", idStation);
				
				//calling the next activity
				startActivity(i);
				
			}});

	}
	

	
	private String loadPrice() {
		double total =0;
		int totalIndex = 0;
		for(int i = 1; i< 4 ; i++)
		if(zones[i])
			totalIndex++;
		if(totalIndex>0)
			total = zonePrice[totalIndex];
		
		if(zones[0] == true && pathStation.get(pathStation.size()-1).getFareZone()!= 0)
			total+=zonePrice[0];
		
		return "$"+String.valueOf(total);
	}



	public String loadTime(int line, int col){
		int timeInt = Constants.TIMES_MATRIX[line][col];//getting time betw these 2 stations in the times matrix
		timeInt+= timeStoped;
		
		String time =timeInt+" minutes"; //  textView just allows string
		
		return time;
	}
	
public void loadPath(int line, int col){
		
		//ArrayList<Station> pathStation = new ArrayList<Station>(); 
		
		Station station;
		int i = 0;
		do{
			//pathStation.add(Constants.stations.get(line));
			station = Constants.stations.get(line);
			
			pathStation.add(station);
			
			//checking zone
			if(!zones[station.getFareZone()] && (line!=col))
				zones[station.getFareZone()] = true;
			
			line = Constants.PATH_MATRIX[line][col];
			i++;
			
		}while(line != col);
		if(i>1){
			station = Constants.stations.get(line);
			pathStation.add(station);
			zones[station.getFareZone()] = true;
			
		}
		
		
		
	}

	public ArrayList<String> loadStationNames(){
		ArrayList<String> stations = new ArrayList<String>();
		
		for(Station s : pathStation ){
			stations.add(s.getName());
			
		}
		return stations;
		
		
	}
	
	

}
