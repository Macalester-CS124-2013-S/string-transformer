package edu.macalester.cs124.stringtransformer;

public class Reverser extends StringTransformer{

	@Override
	public String transform(String s) {
		String result = "";
		for(int i = s.length() - 1; i >= 0; i-- ){
			result = result + s.charAt(i);	
		}
		return(result);
	}

	@Override
	public String toString() {
		return "Reverser";
	}
	
}
