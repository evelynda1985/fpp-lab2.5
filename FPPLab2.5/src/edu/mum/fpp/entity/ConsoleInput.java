package edu.mum.fpp.entity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ConsoleInput {
	
	//constructor by default
	public ConsoleInput() {	}

	public String getInput() throws IOException {
		
		BufferedReader in = null;
		
		String input = null;
		
		in = new BufferedReader(new InputStreamReader(System.in));
		
		//Scanner sc = new Scanner(System.in);
		
		System.out.println("Type the word that you want to reverse:");
		
		try {
			input = in.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			in.close();
		}
		
		System.out.println("you wrote: " + input);
		
		return input;
	}


}
