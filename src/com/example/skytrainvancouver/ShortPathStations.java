package com.example.skytrainvancouver;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;
import android.widget.Toast;

public class ShortPathStations extends Activity {

	
	Spinner origin;
	Spinner destination;
	String stations[];
	AutoCompleteTextView actvO , actvD;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.short_path_stations);
		origin = (Spinner) findViewById(R.id.spinnerOriginStation);
		destination = (Spinner) findViewById(R.id.spinnerDestinyStation);
		stations = loadStationNames();
		
		ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_spinner_item, stations);
		
		dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		
		origin.setAdapter(dataAdapter);
		
		destination.setAdapter(dataAdapter);
		
		ArrayAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,stations);
		
		 actvO = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextViewOrigin);
		 actvD = (AutoCompleteTextView) findViewById(R.id.AutoCompleteTextViewDestination);
		
		actvO.setAdapter(adapter);
		actvD.setAdapter(adapter);
		
		actvO.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				int index = searchStation(actvO.getText().toString());
				if(index>=0)
					origin.setSelection(index);
			}
		
		});
		
		actvD.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				int index = searchStation(actvD.getText().toString());
				if(index>=0)
					destination.setSelection(index);
					
			}
		
		});
		
		
	
		
		
	}
	
	//Returns an array w/ all stations' names
	public String[] loadStationNames(){
		String[] stations = new String[Constants.NUM_STATIONS];
		for(int i = 0; i< Constants.NUM_STATIONS; i++){
			stations[i] = Constants.stations.get(i).getName();
			
		}
		
		
		
		return stations;
		
	}
	public void loadResultActivity(View v){
		

		Intent i = new Intent(ShortPathStations.this,PathResult.class);
		
		
		int line = origin.getSelectedItemPosition();
		int col = destination.getSelectedItemPosition();
		
		i.putExtra("origin", line);
		i.putExtra("destination", col);
		
		startActivity(i);
		
	}
	
	public int searchStation(String  name){
		
		for(int i = 0; i< stations.length ; i++){
			if(name.equals(stations[i]))
				return i;
			
		}
		
		return -1;
		
	}
	
	
	

}
