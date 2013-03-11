package edu.macalester.cs124.stringtransformer;

public class Spoonifier extends StringTransformer {
    
    private String prevPrefix = "";

    @Override
    public String transform(String s) {
        int vowelPos = firstVowelPosition(s);
        String result = prevPrefix + s.substring(vowelPos);
        prevPrefix = s.substring(0, vowelPos);
        return result;
    }

    private boolean isVowel(char a){
        return ("aeiouAEIOU".indexOf(a) != -1);
    }

    private int firstVowelPosition(String s) {
        for(int n = 0; n < s.length(); n++)
            if(isVowel(s.charAt(n)))
                return n;
        return s.length();
    }

    @Override
    public String toString() {
        return "Spooonerisms";
    }

}
