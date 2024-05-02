package com.dilmoni.haim.irisodani;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class AudioActivity extends Activity {
	Button hebrewBtn;
	Button englishBtn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
		
requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
		
		setContentView(R.layout.activity_audio);
		
		getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE,    R.layout.window_title);
		
		hebrewBtn = (Button) findViewById(R.id.hebrewBtn);
		englishBtn = (Button) findViewById(R.id.englishBtn);
		
		englishBtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				 try {
					 Intent intent = new Intent(Intent.ACTION_VIEW);
					 intent.setPackage("com.google.android.youtube");
					 String urlStr="http://www.youtube.com/user/rabbanitIrisEnglis";
					 intent.setData(Uri.parse(urlStr));
					 startActivity(intent);
					 overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
					 //overridePendingTransition(R.anim.anim_out2, R.anim.anim_in2);
					 } catch (Exception e) {
					 e.printStackTrace();
					 Toast.makeText(AudioActivity.this, "You need to have YouTube app installed", Toast.LENGTH_LONG).show();
					 }
			}
		});
		
		hebrewBtn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(AudioActivity.this, "This option will be available soon", Toast.LENGTH_LONG).show();
			}
		});
	}

	

}
