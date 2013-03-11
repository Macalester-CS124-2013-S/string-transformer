package edu.macalester.cs124.stringtransformer;

import static org.junit.Assert.*;

import org.junit.Test;

public class SpoonifierTest {
    @Test
    public void movesConsonantToNextWorld() {
        Spoonifier spoon = new Spoonifier();
        assertEquals("ongle", spoon.transform("dongle"));
        assertEquals("dutz", spoon.transform("frutz"));
    }
    
    @Test
    public void handlesConsonantCluster() {
        Spoonifier spoon = new Spoonifier();
        assertEquals("ongle", spoon.transform("blongle"));
        assertEquals("blutz", spoon.transform("phrutz"));
        assertEquals("phroop", spoon.transform("goop"));
    }
    
    @Test
    public void handlesWordsWithNoVowels() {
        Spoonifier spoon = new Spoonifier();
        assertEquals("", spoon.transform("brlfgh"));
        assertEquals("brlfghog", spoon.transform("wog"));
        assertEquals("w", spoon.transform("gbdfg"));
    }
    
    @Test
    public void handlesWordsWithNoConsonants() {
        Spoonifier spoon = new Spoonifier();
        assertEquals("aeuoi", spoon.transform("aeuoi"));
        assertEquals("og", spoon.transform("wog"));
        assertEquals("wououa", spoon.transform("ououa"));
    }
    
    @Test
    public void handlesEmptyString() {
        Spoonifier spoon = new Spoonifier();
        assertEquals("", spoon.transform(""));
        assertEquals("og", spoon.transform("wog"));
        assertEquals("w", spoon.transform(""));
    }
}




















