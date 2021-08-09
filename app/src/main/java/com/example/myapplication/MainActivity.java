package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate: ");
        setContentView(R.layout.activity_main);
    }
    public void sendMessage(View v){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

    public void onStart()
    {
        super.onStart();
        Log.d(TAG, "In the onStart() event");
    }
    public void onRestart()
    {
        super.onRestart();
        Log.d(TAG, "In the onRestart() event");
    }
    public void onResume()
    {
        super.onResume();
        Log.d(TAG, "In the onResume() event");
    }
    public void onPause()
    {
        super.onPause();
        Log.d(TAG, "In the onPause() event");
    }
    public void onStop()
    {
        super.onStop();
        Log.d(TAG, "In the onStop() event");
    }
    public void onDestroy()
    {
        super.onDestroy();
        Log.d(TAG, "In the onDestroy() event");
    }
}