package test;

import clss.primeFactors;

import static org.junit.Assert.*;

public class primeFactorsTest {

    @org.junit.Before
    public void setUp() throws Exception {

    }

    @org.junit.Test
    public void returnNull() throws Exception {
        assertEquals(null , primeFactors.generate(1));
    }
}