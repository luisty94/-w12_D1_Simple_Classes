import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void setUp()  {
        calculator = new Calculator();
    }

    @Test
    public void canAdd() {
        assertEquals(4, calculator.add(2, 2));
    }

    @Test
    public void canSubtract(){
        assertEquals(4, calculator.subtract(8, 4));
    }

    @Test
    public void canMultiply(){
        assertEquals(30, calculator.multiply(5, 6));
    }

    @Test
    public void canDivide(){
        assertEquals(3.33, calculator.divide(100, 30), 0.01);
    }
}

