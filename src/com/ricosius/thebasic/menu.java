package com.ricosius.thebasic;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class menu extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//Button sounds
		final MediaPlayer buttonSounds = MediaPlayer.create(menu.this, R.raw.button_click);
		// Setting button references
		Button tut1 = (Button) findViewById(R.id.tutorial1);
		Button tut2 = (Button) findViewById(R.id.tutorial2);
		
		tut1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent("com.ricosius.thebasic.TUTORIALONE"));
				buttonSounds.start();
			}
		});
		
		
		tut2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent("com.ricosius.thebasic.TUTORIALONE"));
				buttonSounds.start();
			}
		});
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
	}
	
	public boolean onCreateOptionsMenu(Menu menu){
		super.onCreateOptionsMenu(menu);
		MenuInflater awesome = getMenuInflater();
		awesome.inflate(R.menu.main_menu, menu);
		return true;
	}
	
	public boolean onOptionsItemSelected(MenuItem item){
		switch(item.getItemId()){
		case R.id.menuSweet:
			startActivity(new Intent("com.ricosius.thebasic.SWEET"));
			return true;
		case R.id.menuToast:
			Toast andEggs = Toast.makeText(menu.this, "This is a toast", Toast.LENGTH_LONG);
			andEggs.show();
			return true;
		}
		
		return false;
	}
}
