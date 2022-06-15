package com.tunanh.lsi;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import com.tunanh.lsi.model.Verify_first_model;

public class MainActivity extends AppCompatActivity {
    private static final int TIME_LOADING=3000;
    Verify_first_model verify_first_model= new Verify_first_model();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (verify_first_model.isAge() & verify_first_model.isTerm()) {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                    startActivity(intent);
                }
            }, TIME_LOADING);
        }
        else {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent = new Intent(MainActivity.this, verify_first.class);
                    startActivity(intent);
                }
            }, TIME_LOADING);
        }
    }
}