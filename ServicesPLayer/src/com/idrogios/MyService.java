package com.idrogios;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.widget.Toast;

public class MyService extends Service {
	// A media player reference
	MediaPlayer mp;
	
	@Override
	public IBinder onBind(Intent intent) { // The binding of the called intent
		return null;
	}
	
	
 // The onCreate() method defines the entry point of the service 
	@Override
	public void onCreate() {
		// Shows a text to identify that the service has started
		Toast.makeText(this, "Service Created", 10).show();
		// player object instantiation
		mp = MediaPlayer.create(this,R.raw.choice ); // the constructor gets a reference to the mp3 file on res/raw folder
		mp.setLooping(false); 
	}

	
// the method tha stops the service	
	@Override
	public void onDestroy() {
		Toast.makeText(this, "Service Stopped", 10).show();
	
		mp.stop();
	}

	// the method that starts the service
	@Override
	public void onStart(Intent intent, int startid) {
		Toast.makeText(this, "My Service Started", 10).show();
		mp.start();
	}
}
