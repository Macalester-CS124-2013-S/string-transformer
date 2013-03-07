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
			case 'a': return "↑";
			case 'b': return "↗";
			case 'c': return "→";
			case 'd': return "↘";
			case 'e': return "↓";
			case 'f': return "↙";
			case 'g': return "←";
			case 'h': return "↖";
			case 'i': return "┰";
			case 'j': return "┤";
			case 'k': return "┴";
			case 'l': return "├";
			case 'm': return "┌";
			default: return "";
		}
	}

}
