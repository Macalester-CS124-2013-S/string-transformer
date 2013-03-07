package edu.macalester.cs124.stringtransformer;

public class VowelBleeper extends StringTransformer {

    @Override
    public String transform(String s) {
        String result = "";
        for(int n = 0; n < s.length(); n++) {
            char c = s.charAt(n);
            if(isVowel(c))
                result += '*';
            else
                result += c;
        }
        return result;
    }
    
    private static final String VOWELS = "AEIOUaeiou";

    private boolean isVowel(char c) {
        return VOWELS.indexOf(c) != -1;
    }
    
    @Override
    public String toString() {
        return "Vowels bleeped out";
    }
}
