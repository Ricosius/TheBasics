package com.ricosius.thebasic;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class MainActivity extends Activity {
	
	MediaPlayer logoMusic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        
        logoMusic = MediaPlayer.create(MainActivity.this, R.raw.southafrica );
        logoMusic.start();
        Thread logoTimer = new Thread(){
        	@Override
			public void run(){
        		try{
        			sleep(5000);
        			Intent menuIntent = new Intent("com.ricosius.thebasic.MENU");
        			startActivity(menuIntent);
        		} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        	
        		finally{
        			finish();
        		}
        	}
        };
        logoTimer.start();
    }
    

    @Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		logoMusic.release();
	}


	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
