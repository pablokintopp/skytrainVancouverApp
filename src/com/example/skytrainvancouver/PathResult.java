package com.example.skytrainvancouver;

import java.util.ArrayList;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class PathResult extends ListActivity {
	ArrayList<Station> pathStation; ;
	int origin, destination;
	String stationNames[];
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		pathStation = new ArrayList<Station>();
		
		//loading parameters
		Bundle b = getIntent().getExtras();
		
		origin = b.getInt("origin");
		destination = b.getInt("destination");
		
		
		loadPath(origin, destination);

//		
    	//time.setText("Estimated Time : ");
//		
		//String listViewData[] = {"test","tesst","test","test5","test5"};
		setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,loadStationNames()) );
//	 
	}
	

	
	public String loadTime(int line, int col){
		int timeInt = Constants.TIMES_MATRIX[line][col];
		String time ="Time is approximately: "+timeInt+" Minutes"; //  textView just allows string
		
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
			
			line = Constants.PATH_MATRIX[line][col];
			i++;
			
		}while(line != col);
		if(i>1){
			station = Constants.stations.get(line);
			pathStation.add(station);
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
