package com.dilmoni.haim.irisodani;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class DonationActivity extends Activity {

	private WebView webView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_donation);
		
		webView = (WebView) findViewById(R.id.webViewDonation);
		webView.getSettings().setJavaScriptEnabled(true);
		//webView.getSettings().setBuiltInZoomControls(true);
		//webView.getSettings().setLoadWithOverviewMode(true);
		//webView.getSettings().setUseWideViewPort(true);
		webView.loadUrl("http://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=V35KJBT29TQPQ");
		
	}

	
}
