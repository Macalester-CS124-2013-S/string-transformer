package edu.macalester.cs124.stringtransformer;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VowelBleeperTest {
    
    private final StringTransformer bleeper = new VowelBleeper();
    
    @Test
    public void handlesEmptyString() {
        assertEquals("", bleeper.transform(""));
    }
    
    @Test
    public void bleepsAllVowels() {
        assertEquals("**********", bleeper.transform("aeiouAEIOU"));
    }
    
    @Test
    public void leavesConsonantAlone() {
        assertEquals("zBkjly", bleeper.transform("zBkjly"));
    }
    
    @Test
    public void handlesMixture() {
        assertEquals("*z**gl*ck", bleeper.transform("Azeeglick"));
    }
}
