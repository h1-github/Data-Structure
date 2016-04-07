package h1.wanghuan.ds.s99exercise;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by wanghuan on 16/4/1.
 */
public class TestPrintN {

    PrintN printN;
    int n;

    @Before
    public void setUp(){
        printN = new PrintN();
        n = 50;
    }

    @Test
    public void testPrintN1(){
        printN.printN1(n);
    }

    @Test
    public void testPrintN2(){
        printN.printN2(n);
    }
}
