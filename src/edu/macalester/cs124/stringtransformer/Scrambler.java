package edu.macalester.cs124.stringtransformer;

import java.util.Random;

public class Scrambler extends StringTransformer{
	private Random rand = new Random();
	
	@Override
	public String transform(String s) {
		
		String result = "";
		
		while(s.length() != 0) {
			int l = s.length();
			int r = rand.nextInt(l);
			char c = s.charAt(r);
			result += c;
			s = s.substring(0, r) + s.substring(r+1);
		}
		return result;
	}
	
    @Override
    public String toString() {
        return "Word is Scrambled";
    }
	

}
