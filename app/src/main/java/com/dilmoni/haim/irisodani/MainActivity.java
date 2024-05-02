package com.dilmoni.haim.irisodani;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    private static final String AD_UNIT_ID = "a1529fd7698293c";

    Button videoBtn;
    Button audioBtn;
    Button facebookBtn;
    Button aboutusBtn;
    Button donateBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
        setContentView(R.layout.activity_main);
        getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.window_title);

        videoBtn = (Button) findViewById(R.id.videoBtn);
        audioBtn = (Button) findViewById(R.id.audioBtn);
        facebookBtn = (Button) findViewById(R.id.facebookBtn);
        aboutusBtn = (Button) findViewById(R.id.aboutusBtn);
        donateBtn = (Button) findViewById(R.id.donateBtn);

        videoBtn.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                try {
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setPackage("com.google.android.youtube");
                    String urlStr = "http://www.youtube.com/user/rhaim0425";
                    intent.setData(Uri.parse(urlStr));
                    startActivity(intent);
                    overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
                    //overridePendingTransition(R.anim.anim_out2, R.anim.anim_in2);
                } catch (Exception e) {
                    e.printStackTrace();
                    Toast.makeText(MainActivity.this, "You need to have YouTube app installed", Toast.LENGTH_LONG).show();
                }
            }
        });

        facebookBtn.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
//				Intent intent=getOpenFacebookIntent(MainActivity.this);
//				startActivity(intent);
                String url = "http://www.rabbanitiris.com";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
                overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
                //overridePendingTransition(R.anim.anim_out2, R.anim.anim_in2);
            }
        });


        audioBtn.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                //Intent intent=new Intent(MainActivity.this, AudioActivity.class);
//				String url = "http://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=V35KJBT29TQPQ";
//				Intent i = new Intent(Intent.ACTION_VIEW);
//				i.setData(Uri.parse(url));
//				startActivity(i);
                Intent intent = new Intent(MainActivity.this, AudioActivity.class);
                startActivity(intent);
                //overridePendingTransition(R.anim.fadein_rotate, R.anim.rotation);
                overridePendingTransition(R.anim.anim_out2, R.anim.anim_in2);
            }
        });

        aboutusBtn.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {
                LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View layout = inflater.inflate(R.layout.about_us, (ViewGroup) findViewById(R.id.dialog_layout));
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this).setView(layout);
                AlertDialog alertDialog = builder.create();
                alertDialog.show();

            }
        });

        donateBtn.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                String url = "http://www.rabbanitiris.com";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
                overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
            }
        });
    }

    public static Intent getOpenFacebookIntent(Context context) {

        try {
            context.getPackageManager().getPackageInfo("com.facebook.katana", 0);
            return new Intent(Intent.ACTION_VIEW, Uri.parse("fb://profile/614692985233035"));
        } catch (Exception e) {
            return new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/pages/Rabanit-Iris-Odani-Elyashiv/614692985233035"));
        }

    }

    @Override
    protected void onStart() {
        // TODO Auto-generated method stub
        super.onStart();
        // System.out.println("----main activity---onStart---");
        //overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
    }


}
