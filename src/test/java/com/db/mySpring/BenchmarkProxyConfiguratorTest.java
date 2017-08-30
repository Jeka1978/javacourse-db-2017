package com.db.mySpring;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.PrintStream;
import java.lang.reflect.Proxy;

import static org.junit.Assert.*;

/**
 * Created by Evegeny on 29/08/2017.
 */
public class BenchmarkProxyConfiguratorTest {
    @Test
    public void wrapWithProxyIfNeeded() throws Exception {
        TestBenchmark benchmarkObj = ObjectFactory.getInstance().createObject(TestBenchmark.class);
        Assert.assertNotNull(benchmarkObj);
        Assert.assertTrue(Proxy.isProxyClass(benchmarkObj.getClass()));
        PrintStream mock = Mockito.mock(PrintStream.class);
        Mockito.doAnswer(invocationOnMock -> {
            System.out.println("УРА!!");
            return null;
        }).when(mock).println(Mockito.anyString());
        System.setOut(mock);

        benchmarkObj.a();
        benchmarkObj.b();

    }

}