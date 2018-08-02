package edu.mum.fpp.app;

import edu.mum.fpp.entity.Prog5;

public class App {

	public static void main(String[] args) {
		
		Prog5 p5 = new Prog5("Hello");
		
		System.out.println(p5.getReverse(p5.getWord()));
		

	}

}
