import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CalculatorTest {
    Calculator calculator;
    @Before
    public void before() {calculator = new Calculator(5,2, 10.00, 2.00);}
    @Test
    public void canAdd() {assertEquals(7, calculator.add());}
    @Test
    public void canMinus() {assertEquals(3, calculator.subtract());}
    @Test
    public void canMultiply() {assertEquals(10, calculator.multiply());}
    @Test
    public void canDivide() {assertEquals(5.00, calculator.divide(), 0.00);}



}
