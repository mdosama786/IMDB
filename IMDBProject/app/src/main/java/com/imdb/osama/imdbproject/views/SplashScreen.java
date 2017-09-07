package com.imdb.osama.imdbproject.views;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

import com.imdb.osama.imdbproject.R;

public class SplashScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);

        int SPLASH_TIME_OUT = 2000;
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                Intent i = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(i);
                finish();
            }
        }, SPLASH_TIME_OUT);
    }

}