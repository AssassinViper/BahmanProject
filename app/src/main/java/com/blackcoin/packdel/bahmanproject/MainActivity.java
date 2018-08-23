package com.blackcoin.packdel.bahmanproject;


import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import SplashScreen.SplashScreen;
import Utils.Font;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //region MainCodes

        // Fullscreen the Activity then set the layout
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        // Set the Font
        Font.myFont = Typeface.createFromAsset(this.getAssets(), "fonts/zak.ttf");

        // Splash Screen and Loading data
        new SplashScreen(getSupportFragmentManager()).show();
        //endregion

        //region test codes

        //endregion
    }

    public void createFakeContest(){

    }
}
