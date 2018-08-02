package edu.mum.fpp.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class Prog5Test {
	
	//Using TDD
	//Step 1: Input Hello we will return olleH
	//Our test case fail - obviously
	


	@Test
	public void testReverse() {
		
		Prog5 p5 = new Prog5("Hello");
		
		assertEquals("olleH", p5.getReverse("Hello"));
		
	}

}
