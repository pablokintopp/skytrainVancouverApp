package com.example.skytrainvancouver;

import java.util.ArrayList;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

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
		
		//ListView stationsText = (ListView) findViewById(R.id.listStations);
		

		loadPath(origin, destination);

//		
    	//time.setText("Estimated Time : ");
//		
		//String listViewData[] = {"test","tesst","test","test5","test5"};
		setListAdapter(new ArrayAdapter<String>(this,R.layout.activity_result_path,R.id.textViewTest,loadStationNames()) );
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
	
	protected void onListItemClick(ListView l, View v, int position, long id){
		
		Intent i = new Intent(PathResult.this,StationActivity.class);
		
		
		int idStation = pathStation.get(position).getId();
		
		i.putExtra("id", idStation);
		
		startActivity(i);
	}
	

}
