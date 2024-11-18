package com.hyhomelab.jexpression.runtime;

import junit.framework.TestCase;

import java.math.BigDecimal;

public class RuntimeTest extends TestCase {

    public void testExecuteObject() {
        String exp = "1+1";
        var runtime = new Runtime();
        var result = runtime.executeObject(exp);
        assertEquals(new BigDecimal(2), result);
    }
}