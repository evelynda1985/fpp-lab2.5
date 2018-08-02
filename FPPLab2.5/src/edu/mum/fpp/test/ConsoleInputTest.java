package edu.mum.fpp.test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import edu.mum.fpp.entity.ConsoleInput;

public class ConsoleInputTest {
	
	ConsoleInput inputInformation = new ConsoleInput();
	
	//TDD
	//Step 1: We requiere:
	//		class ConsoleInput 
	//		method: read information from console.
	//Test case #1: we will input information by console and show it up
	//Our test will fail!!!
	
	//Step 2: Create the class for make this run!

	@Test
	public void testGetInputInformation() throws IOException {
				
		//System.out.println(inputInformation.getInput());
		
		assertEquals("Hello", inputInformation.getInput());
		
	}
	
	//Step 3 Refactor:
	// Now we need to reverse the word using Prog5 object.
	//Test case#2: Reverse a word received through console
	@Test
	public void testReverseInput() throws IOException {
		
		System.out.println("reverse: " + inputInformation.getReverseInput());
		
		assertEquals("olleH", inputInformation.getReverseInput());
		
	}
	
	//Test case#3: Testing smallest words that Hello
	@Test
	public void testReverseInputV1() throws IOException {
		
		assertEquals("nuf", inputInformation.getReverseInput());
		
	}
	
	//Test case#4: Testing largest words that Hello
	@Test
	public void testReverseInputV2() throws IOException {
		
		assertEquals("ainrofilaC", inputInformation.getReverseInput());
		
	}

}
