package com.idrogios;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainClass extends Activity implements OnClickListener {
  
  // Button references
  Button buttonStart, buttonStop;

  @Override
  public void onCreate(Bundle savedInstanceState) { // starting point of program
    super.onCreate(savedInstanceState);
    setContentView(R.layout.main);  // layout bind with activity

    
    // objects instantiation
    buttonStart = (Button) findViewById(R.id.buttonStart);
    buttonStop = (Button) findViewById(R.id.buttonStop);
    
    // listen for click events
    buttonStart.setOnClickListener(this);
    buttonStop.setOnClickListener(this);
  }

 // onClick event triggered when a button is clicked
  public void onClick(View src) {
    switch (src.getId()) {
    case R.id.buttonStart:
      startService(new Intent(this, MyService.class)); // method to start a service (calls onStart() method of target class)
      break;
    case R.id.buttonStop:
      stopService(new Intent(this, MyService.class)); // method to stop a service (calls onDestroy() method of target class)
      break;
    }
  }
}