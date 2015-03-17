package com.example.skytrainvancouver;

import android.app.Activity;
import android.gesture.OrientedBoundingBox;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebStorage.Origin;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class ShortPathStations extends Activity {

	
	Spinner origin;
	Spinner destiny;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.short_path_stations);
		origin = (Spinner) findViewById(R.id.spinnerOriginStation);
		destiny = (Spinner) findViewById(R.id.spinnerDestinyStation);
		
		
		ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_spinner_item, loadStationNames());
		
		dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		
		origin.setAdapter(dataAdapter);
		
		destiny.setAdapter(dataAdapter);
		
		
	
		
		
	}
	
	//Returns an array w/ all stations' names
	public String[] loadStationNames(){
		String[] stations = new String[Constants.NUM_STATIONS];
		for(int i = 0; i< Constants.NUM_STATIONS; i++){
			stations[i] = Constants.stations.get(i).getName();
			
		}
		
		
		
		return stations;
		
	}
	
	public void loadPath(View v){
		TextView time = (TextView) findViewById(R.id.textTime);
		TextView path = (TextView) findViewById(R.id.TextPath);
		
		int line = origin.getSelectedItemPosition();
		int colunm = destiny.getSelectedItemPosition();
		//time.setText(Constants.getTime(line, colunm));
	}
}
