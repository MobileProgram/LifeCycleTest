package com.mblhcmute.lifecycletest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("lct", "This is onCreate!");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("lct", "This is onStart!");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("lct", "This is onResume!");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("lct", "This is onPause!");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("lct", "This is onStop!");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("lct", "This is onRestart!");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("lct", "This is onDestroy!");
    }
}