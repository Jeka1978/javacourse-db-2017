package com.db.junit_examples;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by Evegeny on 28/08/2017.
 */
public class TaxCalculatorTest {
    @Test
    public void withNDS() throws Exception {


        NDSResolver mockNdsResolver = mock(NDSResolver.class);
        when(mockNdsResolver.getNDS()).thenReturn(0.1);
      /*  when(mockNdsResolver.getMaam(anyInt())).thenReturn(0.2);
        when(mockNdsResolver.getMaam(100)).thenReturn(0.1);*/


        TaxCalculator taxCalculator = new TaxCalculator(mockNdsResolver);




        double withNDS = taxCalculator.withNDS(100);
        Assert.assertEquals(110,withNDS,0.000001);
    }

}