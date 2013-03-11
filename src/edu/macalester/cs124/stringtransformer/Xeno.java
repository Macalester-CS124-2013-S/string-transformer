package edu.macalester.cs124.stringtransformer;

public class Xeno extends StringTransformer{

	@Override
	public String transform(String s) {
		s = s.toLowerCase();
		String result = "";
		
		
		boolean tier = isTierOne(s.charAt(0));
		if(tier) result += "+";			
		else result += "x";
			
		
		for(int i = 0; i < s.length(); i++){
			if(isTierOne(s.charAt(i)) != tier){
				tier = isTierOne(s.charAt(i));
				 result += "'";
			}
			result += convert(s.charAt(i), tier);
			//System.out.println(convert(result.charAt(i), tier));
		}
		return result;
	}

	@Override
	public String toString() {
		
		return("Xeno");
	}

	private boolean isTierOne(char x){
		if(x <= 'm'){
			return(true);
		}
		else return false;
	}
	
	private String convert(char x, boolean tier) {
		if(!tier)
			x -= 13;
		switch(x) {
			case 'a': return "\u2191";
			case 'b': return "\u2197";
			case 'c': return "\u2192";
			case 'd': return "\u2198";
			case 'e': return "\u2193";
			case 'f': return "\u2199";
			case 'g': return "\u2190";
			case 'h': return "\u2196";
			case 'i': return "\u2530";
			case 'j': return "\u2524";
			case 'k': return "\u2534";
			case 'l': return "\u251c";
			case 'm': return "\u250c";
			default: return "";
		}
	}

}
