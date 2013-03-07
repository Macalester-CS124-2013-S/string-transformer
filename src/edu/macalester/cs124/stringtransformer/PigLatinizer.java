package edu.macalester.cs124.stringtransformer;

public class PigLatinizer extends StringTransformer {
	@Override
	public String transform(String s) {

		for(int n=0; n<s.length(); n++) {
			char c = s.charAt(n);
			if(isVowel(c)) {
				String start = s.substring(0, n);
				String end = s.substring(n, s.length());
				return end + start + "ay";
			}
		}
		return s;
	}
	private static final String VOWELS = "AEIOUaeiou";
	
	private boolean isVowel(char c) {
		return VOWELS.indexOf(c) != -1;
	}

	@Override
	public String toString() {
		return "Pig Latinized";
	}
}
