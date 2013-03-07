package edu.macalester.cs124.stringtransformer;

import static org.junit.Assert.*;

import org.junit.Test;

public class CapitalizerTest {
    
    private final StringTransformer capitalizer = new Capitalizer();
    
    @Test
    public void handlesEmptyString() {
        assertEquals("", capitalizer.transform(""));
    }
    
    @Test
    public void capitalizesFirstLetter() {
        assertEquals("A", capitalizer.transform("a"));
        assertEquals("Zongle", capitalizer.transform("zongle"));
    }
    
    @Test
    public void leavesCapsAlone() {
        assertEquals("A", capitalizer.transform("A"));
        assertEquals("ZonGle", capitalizer.transform("ZonGle"));
        assertEquals("ZONGLE", capitalizer.transform("ZONGLE"));
    }
}
