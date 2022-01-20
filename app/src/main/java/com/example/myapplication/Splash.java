package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        // remove title كود ملئ الشاشة ////
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);


        setContentView(R.layout.activity_splash);



        ///////////كود مدة ظهور شاشة الاسبلاش////////
        Integer SPLASH_TIME = 1000;
        new Handler().postDelayed(new Runnable() {


                                      //// كِوَدِ االانتقال الي الصفحة الرئيسية////
                                      @Override
                                      public void run() {

                                          Intent yousuf = new Intent(Splash.this, MainActivity.class);
                                          startActivity(yousuf);
                                          finish();
                                      }
                                  },

                SPLASH_TIME);





    }
}