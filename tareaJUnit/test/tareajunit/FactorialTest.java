/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareajunit;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author enrique
 */
public class FactorialTest {

    public FactorialTest() {
    }

    /**
     * Test of calculo method, of class Factorial.
     */
    @Test
    public void testCalculo() {
        System.out.println("calculo");
        int result = Factorial.calculo(0);
        int expResult = 1;
        assertEquals(expResult, result);
    }

    @Test(expected = java.lang.IllegalArgumentException.class)
    public void testExceptionArgument() {
        System.out.println("argument");
        int result = Factorial.calculo(-1);
        int expResult = 0;
        assertEquals(expResult, result);
    }
    
    @Test(expected = java.lang.ArithmeticException.class)
    public void testExceptionOverflow() {
        System.out.println("overflow");
        int result = Factorial.calculo(20);
        int expResult = 0;
        assertEquals(expResult, result);
    }

}
