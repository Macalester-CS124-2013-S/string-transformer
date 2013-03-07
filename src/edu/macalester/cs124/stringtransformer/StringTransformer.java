package edu.macalester.cs124.stringtransformer;

import java.util.Scanner;

public abstract class StringTransformer {
    
    public abstract String transform(String s);
    
    /**
     * Returns a copy of the input string with each word (that is, each subsequence of letters)
     * passed through transform(), and all non-letter characters left intact.
     */
    public String transformEachWord(String in) {
        Scanner wordScanner = new Scanner(in).useDelimiter("\\W+");
        StringBuilder out = new StringBuilder();
        int prevEnd = 0;
        while(wordScanner.hasNext()) {
            String word = wordScanner.next();
            out.append(in.substring(prevEnd, wordScanner.match().start()));
            out.append(transform(word));
            prevEnd = wordScanner.match().end();
        }
        out.append(in.substring(prevEnd));
        return out.toString();
    }
    
    /**
     * Used by the UI, so by default we just show the class name. 
     */
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
