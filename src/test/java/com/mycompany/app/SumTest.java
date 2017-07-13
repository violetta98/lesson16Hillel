package com.mycompany.app;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit test for simple Sum.
 */
public class SumTest {
    private Sum sum;

    @Before // метод будет выполняться до каждого теста
    public void setUp() throws Exception {
        this.sum = new Sum();
    }

    /**
     * This method tests sum.
     */
    @Test
    public void sumTest() {
        assertEquals(4, sum.add(2,2));
    }
}
