package edu.macalester.cs124.stringtransformer;

import java.util.Random;

public class IMifier extends StringTransformer {
	
	@Override 
	public String transform(String s) {
		s = s.toLowerCase();
		s = vowelRemover(s);
		String a = imWords();
		return s + a;
	}
	
	private Random rand = new Random();
	
	private String imWords() {
		int a = rand.nextInt(25);
		switch(a) {
		case 1: return " lol";
		case 2: return " lmao";
		case 3: return " omg";
		case 4: return " jk";
		case 5: return " rofl";
		default: return "";
		}
	}
	
	@Override
	public String toString() {
		return "Transformed into IM talk";
	}
	
	private static final String VOWELS = "AEIOUaeiou";

    private boolean isVowel(char c) {
        return VOWELS.indexOf(c) != -1;
    }
    
    private String vowelRemover(String s) {
    	String result = "";
    	for(int n = 0; n < s.length(); n++) {
            char c = s.charAt(n);
            if(isVowel(c)) {
            	int a = rand.nextInt(5);
            	if (a == 1) {
            		String b = s.substring(0, n);
        			String d = s.substring(n+1);
        			result = b + d;
            	}
            	else {
            		result = s;
            	}
            }
    	}
    	return result;
    }
 }
