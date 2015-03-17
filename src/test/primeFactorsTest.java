package test;

import clss.primeFactors;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class primeFactorsTest {

    List<Integer> divisors;

    @Before
    public void setUp() throws Exception {
        divisors =new ArrayList<Integer>();
    }

    @Test
    public void returnList_Vacia() throws Exception {
        assertEquals(addlist(), 1);
    }

    @Test
    public void num_2_resultado_2() throws Exception {
        assertEquals(addlist(2), 2);
    }

    public List<Integer> addlist(int ... multiplicadores){

        for (int c :multiplicadores)
            divisors.add(c);
        return divisors;
    }

    public void  assertEquals(List<Integer> primos, int numero ){
        Assert.assertEquals(primos, primeFactors.generate(numero));

    }
}