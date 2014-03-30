package com.example.soundboard;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Soundboard extends Activity {
	MediaPlayer mPlayer = new MediaPlayer();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_soundboard);
		Button button1 = (Button) findViewById(R.id.button1);
		Button button2 = (Button) findViewById(R.id.button2);
		Button button3 = (Button) findViewById(R.id.button3);
		Button button4 = (Button) findViewById(R.id.button4);
		Button button5 = (Button) findViewById(R.id.button5);
		Button button6 = (Button) findViewById(R.id.button6);
		Button button7 = (Button) findViewById(R.id.button7);
		Button button8 = (Button) findViewById(R.id.button8);
		Button button9 = (Button) findViewById(R.id.button9);
		Button button10 = (Button) findViewById(R.id.button10);
		
		button1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if (mPlayer.isPlaying()) {
					mPlayer.stop();
					mPlayer.reset();
				}
				try {
					mPlayer = MediaPlayer.create(Soundboard.this, R.raw.baby);
					//mPlayer.prepare();
					mPlayer.start();
				} catch (IllegalStateException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		});
		
		button2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if (mPlayer.isPlaying()) {
					mPlayer.stop();
					mPlayer.reset();
				}
				try {
					mPlayer = MediaPlayer.create(Soundboard.this, R.raw.alwaysgetstheyes);
					//mPlayer.prepare();
					mPlayer.start();
				} catch (IllegalStateException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		});
		
		button3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if (mPlayer.isPlaying()) {
					mPlayer.stop();
					mPlayer.reset();
				}
				try {
					mPlayer = MediaPlayer.create(Soundboard.this, R.raw.basketball);
					//mPlayer.prepare();
					mPlayer.start();
				} catch (IllegalStateException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		});
		
		button4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if (mPlayer.isPlaying()) {
					mPlayer.stop();
					mPlayer.reset();
				}
				try {
					mPlayer = MediaPlayer.create(Soundboard.this, R.raw.bestideaever);
					//mPlayer.prepare();
					mPlayer.start();
				} catch (IllegalStateException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		});
		
		button5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if (mPlayer.isPlaying()) {
					mPlayer.stop();
					mPlayer.reset();
				}
				try {
					mPlayer = MediaPlayer.create(Soundboard.this, R.raw.blackoutorgasms);
					//mPlayer.prepare();
					mPlayer.start();
				} catch (IllegalStateException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		});
		
		button6.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if (mPlayer.isPlaying()) {
					mPlayer.stop();
					mPlayer.reset();
				}
				try {
					mPlayer = MediaPlayer.create(Soundboard.this, R.raw.broworkers);
					//mPlayer.prepare();
					mPlayer.start();
				} catch (IllegalStateException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		});
		
		button7.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if (mPlayer.isPlaying()) {
					mPlayer.stop();
					mPlayer.reset();
				}
				try {
					mPlayer = MediaPlayer.create(Soundboard.this, R.raw.deadbatteries);
					//mPlayer.prepare();
					mPlayer.start();
				} catch (IllegalStateException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		});
		
		button8.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if (mPlayer.isPlaying()) {
					mPlayer.stop();
					mPlayer.reset();
				}
				try {
					mPlayer = MediaPlayer.create(Soundboard.this, R.raw.howsmybowtie);
					//mPlayer.prepare();
					mPlayer.start();
				} catch (IllegalStateException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		});
		
		button9.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if (mPlayer.isPlaying()) {
					mPlayer.stop();
					mPlayer.reset();
				}
				try {
					mPlayer = MediaPlayer.create(Soundboard.this, R.raw.marshallscherry);
					//mPlayer.prepare();
					mPlayer.start();
				} catch (IllegalStateException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		});
		
		button10.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				if (mPlayer.isPlaying()) {
					mPlayer.stop();
					mPlayer.reset();
				}
				try {
					mPlayer = MediaPlayer.create(Soundboard.this, R.raw.vaginachecks);
					//mPlayer.prepare();
					mPlayer.start();
				} catch (IllegalStateException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.soundboard, menu);
		return true;
	}

}
