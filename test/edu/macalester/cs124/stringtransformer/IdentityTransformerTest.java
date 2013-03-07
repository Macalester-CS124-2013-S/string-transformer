package edu.macalester.cs124.stringtransformer;

import static org.junit.Assert.*;

import org.junit.Test;

public class IdentityTransformerTest {
    
    private final StringTransformer ident = new IdentityTransformer();
    
    @Test
    public void handlesEmptyString() {
        assertEquals("", ident.transform(""));
    }
    
    @Test
    public void leavesEverythingAlone() {
        assertEquals("a", ident.transform("a"));
        assertEquals("zonGle", ident.transform("zonGle"));
    }
}
