package com.example.skytrainvancouver;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class CustomAdapter extends ArrayAdapter<Station> {

	public CustomAdapter(Context context,int resource, int textViewResourceId,ArrayList<Station> stations) {
	    super(context,resource,textViewResourceId, stations);
	}

	public CustomAdapter(Context context, int resource, ArrayList<Station> stations) {
	    super(context, resource, stations);
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

	    View view = convertView;

	    if (view == null) {

	        LayoutInflater vi;
	        vi = LayoutInflater.from(getContext());
	        view = vi.inflate(R.layout.list_view_design, null);

	    }

	    Station s = (Station) getItem(position);

	    if (s != null) {

	        TextView name = (TextView) view.findViewById(R.id.txtStationName);
	        TextView lines = (TextView) view.findViewById(R.id.txtLinesChar);
	        TextView zone = (TextView) view.findViewById(R.id.txtFareZone);
	        
	        if (name != null) {
	            name.setText(s.getName());
	            
	        }
	        if (lines != null) {

	            lines.setText("Line: "+s.showLines());
	        }
	        if (zone != null) {
	        	int z = s.getFareZone();
	        	String zon ="";
	        	if(z>0)
	        		zon= ""+z;
	        	else
	        		zon = "Airport";
	            zone.setText("Zone: "+zon);
	        }
	    }

	    return view;

	}
}
