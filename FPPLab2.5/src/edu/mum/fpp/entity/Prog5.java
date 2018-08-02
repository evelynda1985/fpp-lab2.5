package edu.mum.fpp.entity;

public class Prog5 {
	
	private String word;
	
	//Constructor by default
	public Prog5() {}
	
	//Constructor with arguments
	public Prog5(String word) {
		this.word = word;
	}

	//Getters and setters
	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}
	
	
	//Method to reverse a word using StringBuilder and StringBuffer
	
	//StringBuilder: can append characters and Strings without significant cost. No thread safe
	//StringBuffer: StringBuffer is synchronized( which means it is thread safe)
	public String getReverse(String word) {
		
		int wordLenght = word.length();
		
		StringBuilder finalWord = new StringBuilder();
		
		for(int i=wordLenght-1; i>=0; i--) {
			
			finalWord.append(word.charAt(i));
			
		}
		
		//Convert the StringBuilder to a String at the end.
		String finalWordAsString = finalWord.toString();
		
		//System.out.println(finalWordAsString);
		
		return finalWordAsString;
	}
	

}
