package com.example.skytrainvancouver;

import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class SplashActivity extends Activity {
	static int TIME_TASK = 3000; // each 1000 == 1s

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash_screen);
		
		Constants.initStations();
		
        TimerTask task = new TimerTask() {
			
			@Override
			public void run() {
				finish();
				startActivity(new Intent(SplashActivity.this, ShortPathStations.class ));
				
			}
		};
		Timer opening = new Timer();
		opening.schedule(task, TIME_TASK);
	}
}
