package com.example.skytrainvancouver;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.TextView;

public class StationActivity extends Activity {

	int idStation;
	Station station;
	@SuppressWarnings("deprecation")
	Gallery gallery;
	ImageView image;
	
	@SuppressWarnings("deprecation")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_station);
		//loading parameters
		Bundle b = getIntent().getExtras();
		idStation = b.getInt("id");
		station = Constants.stations.get(idStation);
		
		final TextView title = (TextView) findViewById(R.id.textViewName);
		final TextView info = (TextView) findViewById(R.id.textViewInfo);
		final TextView titlePoint = (TextView) findViewById(R.id.textViewNamePoint);
		gallery = (Gallery) findViewById(R.id.galleryPoints);
		image = (ImageView) findViewById(R.id.imageViewZoom);
		
		image.setMinimumWidth(500);
		image.setMinimumHeight(500);
		
		title.setText(station.getName());
		
		
		info.setText(station.showInfo());
		
		gallery.setAdapter(new ImageAdapter(this,station));
		gallery.setOnItemClickListener(new OnItemClickListener() {
			
			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				image.setImageResource(station.getPoints().get(position).getIdImg());
				titlePoint.setText(station.getPoints().get(position).getName());
			}
		});
	}
	
}

class ImageAdapter extends BaseAdapter{

	private Context context;
	Station station;
	
	public ImageAdapter(Context c,Station station) {
		this.context =c;
		this.station =station;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return station.getPoints().size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@SuppressWarnings("deprecation")
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ImageView pic = new ImageView(context);
		pic.setImageResource(station.getPoints().get(position).getIdImg());
		pic.setScaleType(ImageView.ScaleType.FIT_XY);
		pic.setLayoutParams(new Gallery.LayoutParams(200,175));
		
		return pic;
	}
	
	
}
