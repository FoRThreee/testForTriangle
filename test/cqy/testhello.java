package cqy;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;


public class testhello {

private static hello calculator = new hello();
    
    @Before
    public void setUp() throws Exception {
        calculator.clear();
    }

    @Test
    public void testEquilateral() {
        calculator.equilateral(2,2,2);
        assertEquals(true, calculator.getResult());
    }

    @Test
    public void testIsosceles() {
        calculator.isosceles(3,3,5);
        assertEquals(true, calculator.getResult());
    }
    
    @Test
    public void testScalene() {
        calculator.scalene(4,3,5);
        assertEquals(true, calculator.getResult());
    }
}