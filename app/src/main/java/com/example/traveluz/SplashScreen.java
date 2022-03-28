package com.example.traveluz;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.preference.PreferenceManager;

import com.ingroup.traveluz.R;

public class SplashScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(() -> {
            SharedPreferences settings=getSharedPreferences("prefs",0);
            boolean firstRun=settings.getBoolean("firstRun",false);
            if(firstRun==false) {
                SharedPreferences.Editor editor=settings.edit();
                editor.putBoolean("firstRun",true);
                editor.commit();
                Intent i=new Intent(SplashScreen.this,FirstPage.class);
                startActivity(i);
                finish();
            } else {
                Intent a=new Intent(SplashScreen.this,MainActivity.class);
                startActivity(a);
                finish();
            }
        }, 3000);
    }
}