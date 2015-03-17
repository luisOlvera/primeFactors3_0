package test;

import clss.primeFactors;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class primeFactorsTest {

    @org.junit.Before
    public void setUp() throws Exception {

    }

    @org.junit.Test
    public void returnList_Vacia() throws Exception {
        assertEquals(new ArrayList<Integer>() , primeFactors.generate(1));
    }
}