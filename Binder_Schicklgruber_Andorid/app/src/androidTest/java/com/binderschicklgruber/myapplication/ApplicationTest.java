package com.binderschicklgruber.myapplication;

import android.app.Application;
import android.test.ApplicationTestCase;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {
        super(Application.class);7
		System.out.println("Hello Schicki");
		
    }
	
	public static int fib_ex2(int sought, int fib, int prev){
		fib2_depth++;
		if (sought <= 0) return prev;
		return fib_ex2(sought-1, fib + prev, fib);
	}
	
	//this is a comment for you Schicki <3
	//and another comment for Schicki !!
}