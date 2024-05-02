package com.dilmoni.haim.irisodani;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class SplashActivity extends Activity {

	private static final String TAG = SplashActivity.class.getName();
	private long SleepTime=3;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		//this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

		setContentView(R.layout.activity_splash);

		IntentLauncher launcher=new IntentLauncher();
		launcher.start();
	}


	private class IntentLauncher extends Thread{

		public void run(){
			try {
				Thread.sleep(SleepTime*1000);

			} catch (Exception e) {
				Log.e(TAG, e.getMessage());
			}
			Intent intent=new Intent(SplashActivity.this, MainActivity.class);
			startActivity(intent);
			SplashActivity.this.finish();

		}

	}
}
