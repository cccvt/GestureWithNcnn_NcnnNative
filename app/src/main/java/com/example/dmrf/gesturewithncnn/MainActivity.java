package com.example.dmrf.gesturewithncnn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.dmrf.gesturewithncnn.TestProcess.GestureTest;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GestureTest gestureTest=new GestureTest(MainActivity.this);
        gestureTest.InitTest();
        gestureTest.DetectTest();

    }
}
