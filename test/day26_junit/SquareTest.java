package day26_junit;

import org.junit.Test;
import static org.junit.Assert.*;

public class SquareTest {
    
    public SquareTest() {
    }

    @Test
    public void testArea() {
        int excepted = 40;
        Square s = new Square(2);
        int actual = s.area();
        assertEquals(excepted, actual);
    }

    @Test
    public void testArea2() {
        int excepted = 50;
        Square s = new Square(10);
        int actual = s.area2();
        assertEquals(excepted, actual);
    }
    
}
