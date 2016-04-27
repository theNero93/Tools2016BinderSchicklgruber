package com.binderschicklgruber.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		
    }

    public void thisIsANewMethod(){

		System.out.println("Hello Schicki");

		System.out.println("yoloSwagIsNice");

		System.out.println("dfd");
		
		for (int i = 0; i < 10; i++){
			System.out.println("Yolo is a a lebn");
		}
    }
}
