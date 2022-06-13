import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void canAdd(){
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void canMinus(){
        assertEquals(2, calculator.minus(5,3));
    }

    @Test
    public void canMultiply(){
        assertEquals(6, calculator.multiply(3,2));
    }

    @Test
    public void canDivide(){
        assertEquals(3.0, calculator.divide(6.00, 2.00), 0.0);
    }

}
