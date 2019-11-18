package day26_junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;

public class SquareTest {
    
    @BeforeClass
    public static void beforeClass() {
        System.out.println("before class");
    }
    
    @Before
    public void before() {
        System.out.println("before");
    }
    
    public SquareTest() {
    }

    @Test
    public void testArea() {
        System.out.println("testArea");
        int excepted = 40;
        Square s = new Square(2);
        int actual = s.area();
        assertEquals(excepted, actual);
    }

    @Test
    public void testArea2() {
        System.out.println("testArea2");
        int excepted = 50;
        Square s = new Square(10);
        int actual = s.area2();
        assertEquals(excepted, actual);
    }
    
    

    @After
    public void after() {
        System.out.println("after");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("after class");
    }
    
}
