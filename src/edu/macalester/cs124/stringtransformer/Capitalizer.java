package edu.macalester.cs124.stringtransformer;

public class Capitalizer extends StringTransformer {

    @Override
    public String transform(String s) {
        if(s.length() == 0)
            return s;
        else
            return Character.toUpperCase(s.charAt(0)) + s.substring(1);
    }
    
    @Override
    public String toString() {
        return "First letter capitalized";
    }
}
