package edu.mum.fpp.test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import edu.mum.fpp.entity.ConsoleInput;

public class ConsoleInputTest {
	
	//TDD
	//Step 1: We requiere:
	//		class ConsoleInput 
	//		method: read information from console.
	//Test case #1: we will input information by console and show it up
	//Our test will fail!!!
	
	//Step 2: Create the class for make this run!

	@Test
	public void testGetInputInformation() throws IOException {
		
		ConsoleInput inputInformation = new ConsoleInput();
		
		//System.out.println(inputInformation.getInput());
		
		assertEquals("Hello", inputInformation.getInput());
		
	}

}
