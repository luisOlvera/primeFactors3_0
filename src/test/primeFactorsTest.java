package test;

import clss.primeFactors;
import org.junit.Assert;
import org.junit.Before;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class primeFactorsTest {

    List<Integer> divisors;

    @Before
    public void setUp() throws Exception {
        divisors =new ArrayList<Integer>();

    }

    @org.junit.Test
    public void returnList_Vacia() throws Exception {
        Assert.assertEquals(new ArrayList<Integer>(), primeFactors.generate(1));
    }

    @org.junit.Test
    public void num_2_resultado_2() throws Exception {
        Assert.assertEquals(addlist(2), primeFactors.generate(2));
    }

    public List<Integer> addlist(int ... multiplicadores){

        for (int c :multiplicadores)
            divisors.add(c);
        return divisors;
    }
}