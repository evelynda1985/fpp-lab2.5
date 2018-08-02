package edu.mum.fpp.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.mum.fpp.entity.Prog5;

public class Prog5Test {
	
	//Using TDD
	//Step 1: Input Hello we will return olleH
	//Our test case fail - obviously
	
	//Step 2: create the classes and method to make this code run!
	//We need:
	//		Class Prog5: reverse method
	//		Class App: to run the code in the main
	//Test case #1: receive a string and reverse it
	

	@Test
	public void testReverse() {
		
		Prog5 p5 = new Prog5("Hello");
		
		assertEquals("olleH", p5.getReverse("Hello"));
		
	}
	
	//Step 3: Refactor the code and accomplish the requirements
	//Test case2: receive string by console and create the Prog5 object with that
	

}
