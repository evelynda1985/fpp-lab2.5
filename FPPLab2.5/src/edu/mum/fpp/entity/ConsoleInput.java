package edu.mum.fpp.entity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleInput {
	
	private Prog5 p5 = new Prog5();
	
	//constructor by default
	public ConsoleInput() {	}

	//Read information through console
	public String getInput() throws IOException {
		
		BufferedReader in = null;
		
		String input = null;
		
		in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Type the word that you want to reverse:");
		
		try {
			input = in.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("you wrote: " + input);
		
		return input;
	}
	
	//Reverse the word that was input by console
	public String getReverseInput() throws IOException {
		
		String wordToReverse = getInput();
		
		String finalWord = p5.getReverse(wordToReverse);
		
		return finalWord;
		
	}


}
