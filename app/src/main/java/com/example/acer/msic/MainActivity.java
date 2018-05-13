package com.example.acer.msic;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

import com.example.acer.msic.host.HostActivity;
import com.example.acer.msic.speaker.SpeakerActivity;

public class MainActivity extends Activity
{
	// public key for other activities to access to figure out the mode
	public final static String MODE = "MODE";

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		// getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void onBtnHost(View view)
	{
		Intent intent = new Intent(this, HostActivity.class);
		intent.putExtra(MODE, HostActivity.HOST_MODE);
		startActivity(intent);
	}

	public void onBtnSp(View view)
	{
		Intent i = new Intent(this, SpeakerActivity.class);
		i.putExtra(MODE, SpeakerActivity.SPEAKER_MODE);
		startActivity(i);
	}
}
